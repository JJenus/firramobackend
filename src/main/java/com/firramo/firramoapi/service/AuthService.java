package com.firramo.firramoapi.service;

import com.firramo.firramoapi.model.*;
import com.firramo.firramoapi.repository.BalanceRepo;
import com.firramo.firramoapi.repository.LoginSessionRepo;
import com.firramo.firramoapi.repository.RoleRepo;
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

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.nonNull;

@Service
@RequiredArgsConstructor
public class AuthService {
    @Autowired
    AppUserService appUserService;
    @Autowired
    private JWTUtil jwtUtil;

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

    public AuthToken registerUser(AppUser user){
        if (null != appUserService.getUserByEmail(user.getEmail()))
            return null;

        System.out.println("\n>>> "+user.getPassword());

        user.setPassword(passwordEncoder.encode(user.getPassword()));

        List<Role> roles = new ArrayList<>();
        Role role = roleRepo.findByName(ROLE.USER.name())
                .orElse(new Role(ROLE.USER.name()));
        roles.add(role);
        user.setRoles(roles);

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

        return authToken;
    }

    public AuthToken login(AppUser user){
        try {
            if (appUserService.getUserByEmail(user.getEmail()) == null) {
                System.out.println("Empty user");
                return null;
            }

            UsernamePasswordAuthenticationToken authInputToken =
                    new UsernamePasswordAuthenticationToken(user.getEmail(), user.getPassword());

            authManager.authenticate(authInputToken);

            String token = jwtUtil.generateToken(user);

            AuthToken authToken = new AuthToken();
            authToken.setToken(token);
            authToken.setUser(appUserService.getUserByEmail(user.getEmail()));

            return authToken;
        }catch (AuthenticationException authExc){
            System.out.println(authExc.getMessage());
        }
        return new AuthToken();
    }

    public LoginSession logSession(AppUser user, HttpServletRequest request) {
        UserAgent userAgent = UserAgent.parseUserAgentString(request.getHeader("User-Agent"));

        System.out.println(">>> User agent: " + request.getHeader("User-Agent"));
        String ip = extractIp(request);
        //https://ipapi.co/146.70.99.181/json for more detailed (inaccurate)
        // timezone token aYxNuOITGzXIUuosRmks
//        ip = "102.89.33.54";

        JSONObject location =  req(ip);
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
        String clientIp;
        System.out.println(">>> X-forwarded for: "+request
                .getHeader("x-forwarded-for"));
        System.out.println(">>> Remote user: " + request.getRemoteUser());
        for (String header : IP_HEADER_CANDIDATES) {
            String ip = request.getHeader(header);
            if (ip != null && ip.length() != 0 && !"unknown".equalsIgnoreCase(ip)) {
                return ip;
            }
        }


        return "";
    }

    String parseXForwardedHeader(String header){
        System.out.println("\n\n>>> "+header);
        return header;
    }

    private JSONObject req(String ip){
        String uri = "https://ipapi.co/"+ip+"/json";
        RestTemplate restTemplate = new RestTemplate();
        JSONObject jsonObject = null;
        try{
            String result = restTemplate.getForObject(uri, String.class);
            jsonObject = new JSONObject(result);
            jsonObject.getString("city");
        }catch (Exception e){
            jsonObject = new JSONObject("{\"city\": \"unknown\", \"country_name\": \"unknown\"}");
            e.printStackTrace();
        }
        System.out.println(jsonObject);

        return jsonObject;
    }

    public List<LoginSession> getSessions(Long userId) {
        return loginSessionRepo.findByUserId(userId);
    }
}