package com.firramo.firramoapi.service;

import com.firramo.firramoapi.model.PasswordReset;
import com.firramo.firramoapi.model.firramo.*;
import com.firramo.firramoapi.repository.firramo.BalanceRepo;
import com.firramo.firramoapi.repository.firramo.LoginSessionRepo;
import com.firramo.firramoapi.repository.firramo.RoleRepo;
import com.firramo.firramoapi.repository.firramo.TokenRepo;
import com.firramo.firramoapi.security.JWTUtil;
import eu.bitwalker.useragentutils.UserAgent;
import javax.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class AuthService {
    @Autowired
    AppUserService appUserService;
    @Autowired
    private JWTUtil<AppUser> jwtUtil;

    private final AuthenticationManager authManager;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private RoleRepo roleRepo;
    @Autowired
    private LoginSessionRepo loginSessionRepo;
    @Autowired
    private SettingsService settingsService;
    @Autowired
    private BalanceRepo balanceRepo;

    @Autowired
    TokenRepo tokenRepo;
    @Autowired
    EmailSender emailSender;

    private static final String[] IP_HEADER_CANDIDATES = {
            "X-Forwarded-For",
            "Proxy-Client-IP",
            "WL-Proxy-Client-IP",
            "HTTP_X_FORWARDED_FOR",
            "HTTP_X_FORWARDED",
            "HTTP_X_CLUSTER_CLIENT_IP",
            "HTTP_CLIENT_IP",
            "HTTP_FORWARDED_FOR",
            "HTTP_FORWARDED",
            "HTTP_VIA",
            "REMOTE_ADDR" };

    public Map<String, String> changePassword(ChangePassword password){
        AppUser user = appUserService.getUser(password.getUserId());
        if (user == null){
            return Collections.singletonMap("error", "User doesn't exist");
        }
        boolean confirmPassword = passwordEncoder.matches(
                password.getCurrentPassword(), user.getPassword()
        );

        if (!confirmPassword){
            return Collections.singletonMap("error", "Incorrect password!");
        }

        user.setPassword(passwordEncoder.encode(password.getNewPassword()));
        appUserService.save(user);

        return Collections.singletonMap("status", "Password changed.");
    }

    public AuthToken registerUser(AppUser user){
        if (null != appUserService.getUserByEmail(user.getEmail()))
            return null;

        user.setPassword(passwordEncoder.encode(user.getPassword()));

        if (user.getRoles() == null || user.getRoles().isEmpty()){
            List<Role> roles = new ArrayList<>();
            Role role = roleRepo.findByName(ROLE.USER.name())
                    .orElse(new Role(ROLE.USER.name()));
            roles.add(role);
            user.setRoles(roles);
        }
        else{
            List<Role> roles = new ArrayList<>();
            Role role = roleRepo.findByName(ROLE.ADMIN.name())
                    .orElse(new Role(ROLE.ADMIN.name()));
            roles.add(role);
            user.setRoles(roles);
        }

        String currency = settingsService.getSettings().getCurrency();

        Balance balance = Balance.builder()
                .currency(currency)
                .amount("0")
                .build();
        balance = balanceRepo.save(balance);

        user.setBalance(balance);

        user = appUserService.save(user);

        String token = jwtUtil.generateToken(user);

        AuthToken authToken = new AuthToken();
        authToken.setUser(user);
        authToken.setToken(token);

        try{
            emailSender.sendWelcomeMail(user);
        }catch (Exception ignored){}

        return authToken;
    }

    public AuthToken login(AppUser user){
        try {
            AppUser appUser = appUserService.getUserByEmail(user.getEmail());
            if ( appUser == null) {
                return null;
            }

            if(appUser.getStatus() != null && appUser.getStatus().equalsIgnoreCase("deleted")){
                return null;
            }

//            UsernamePasswordAuthenticationToken authInputToken =
//                    new UsernamePasswordAuthenticationToken(user.getEmail(), user.getPassword());
//
//            authManager.authenticate(authInputToken);


            if (!passwordEncoder.matches(user.getPassword(), appUser.getPassword())){
                return new AuthToken();
            }

            String token = jwtUtil.generateToken(user);

            AuthToken authToken = new AuthToken();
            authToken.setToken(token);
            authToken.setUser(appUser);

            return authToken;
        }catch (AuthenticationException authExc){
            System.out.println(authExc.getMessage());
        }
        return new AuthToken();
    }

    public LoginSession logSession(AppUser user, HttpServletRequest request) {
        UserAgent userAgent = UserAgent.parseUserAgentString(request.getHeader("User-Agent"));
        String ip = (user.getIp() == null) ? extractIp(request) : user.getIp();

        JSONObject location =  requestLocation(ip);
        String city = location.getString("city");
        String country = location.getString("country_name");

        String deviceId = ""+userAgent.getOperatingSystem().getId();
        String device = userAgent.getOperatingSystem().getName();

        deviceId = device+"-"+deviceId+"-"+country+"-"+city + "-"+user.getId();

        LoginSession session = loginSessionRepo.findByDeviceId(deviceId).orElse(null);

        if (session == null) {
            session = LoginSession.builder()
                    .userId(user.getId())
                    .device(device)
                    .browser(userAgent.getBrowser().getName())
                    .country(country)
                    .deviceId(deviceId)
                    .city(city).build();
        }

        System.out.println(session);
        session.setUpdatedAt(LocalDateTime.now());

        return loginSessionRepo.save(session);
    }

    private String extractIp(HttpServletRequest request) {
        String ip = "";

        for (String header : IP_HEADER_CANDIDATES) {
            ip = request.getHeader(header);
            if (ip != null && ip.length() != 0 && !"unknown".equalsIgnoreCase(ip)) {
                break;
            }
        }

        return ip;
    }

    String parseXForwardedHeader(String header){
        System.out.println("\n\n>>> "+header);
        return header;
    }

    private JSONObject requestLocation(String ip){
//        https://ipapi.co/146.70.99.181/json for more detailed (inaccurate)
//         timezone token aYxNuOITGzXIUuosRmks
//        ip = "102.89.33.54";
        String uri = "https://ipapi.co/"+ip+"/json";
        RestTemplate restTemplate = new RestTemplate();
        JSONObject jsonObject = null;
        try{
            String result = restTemplate.getForObject(uri, String.class);
            jsonObject = new JSONObject(result);
            jsonObject.getString("city");
        }catch (Exception e){
            jsonObject = new JSONObject("{\"city\": \"unknown\", \"country_name\": \"unknown\"}");
        }

        return jsonObject;
    }

    public List<LoginSession> getSessions(Long userId) {
        return loginSessionRepo.findByUserId(userId);
    }


    public void sendPasswordReset(PasswordReset passwordReset) throws IllegalAccessException {
        AppUser user = appUserService.getUserByEmail(passwordReset.getEmail());
        if(user != null){
            Token token = new Token();
            token.setUserId(user.getId());
            String tk;
            do {
                tk = generateToken()+"";
            } while (tokenRepo.findByToken(tk) != null);

            token.setToken(tk);
            token.setExpiresAt(LocalDateTime.now().plusMinutes(20));

            tokenRepo.save(token);
//            System.out.println("Saved Token");

            emailSender.sendReset(user, token.getToken());
        }else{
            throw new IllegalAccessException("Email does not exist");
        }
    }

    public void resetPassword(PasswordReset passwordReset) throws IllegalAccessException {
        Token token = tokenRepo.findByToken(passwordReset.getToken());
        if (token != null){
            if (LocalDateTime.now().isAfter(token.getExpiresAt())){
                throw new IllegalAccessException("Token expired");
            }

            AppUser user = appUserService.getUser(token.getUserId());
            if (user != null){
                user.setPassword(passwordEncoder.encode(passwordReset.getPassword()));
                appUserService.save(user);
            }else {
                throw new IllegalAccessException("Unauthorised access");
            }
        }
        else {
//            assert token != null;
            System.out.println(token +" isExpired?: "+ LocalDateTime.now().isAfter(token.getExpiresAt()));
            throw new IllegalAccessException("Invalid Token");
        }
    }

    private int generateToken(){
        SecureRandom secureRandom = new SecureRandom();

        int min = 100000; // Minimum 6-digit number
        int max = 999999; // Maximum 6-digit number

        return secureRandom.nextInt(max - min + 1) + min;
    }
}