package com.firramo.firramoapi.service.evergreen;

import com.firramo.firramoapi.model.evergreen.AppUser;
import com.firramo.firramoapi.model.evergreen.AuthToken;
import com.firramo.firramoapi.model.evergreen.ROLE;
import com.firramo.firramoapi.model.evergreen.Role;

import com.firramo.firramoapi.repository.evergreen.EvergreenRoleRepo;
import com.firramo.firramoapi.security.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EvergreenAuthService {
    @Autowired
    EvergreenAppUserService evergreenAppUserService;
    @Autowired
    private JWTUtil<AppUser> jwtUtil;
    @Autowired
    private AuthenticationManager authManager;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private EvergreenRoleRepo roleRepo;

    public AuthToken registerUser(AppUser user){
        if (null != evergreenAppUserService.getUserByEmail(user.getEmail()))
            return null;

        user.setPassword(passwordEncoder.encode(user.getPassword()));

        if (user.getRoles() == null || user.getRoles().isEmpty()){
            List<Role> roles = new ArrayList<>();
            Role role = roleRepo.findByName(ROLE.PUNTER.name())
                    .orElse(new Role(ROLE.PUNTER.name()));
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

        user = evergreenAppUserService.save(user);

        String token = jwtUtil.generateToken(user);

        AuthToken authToken = new AuthToken();
        authToken.setUser(user);
        authToken.setToken(token);

        return authToken;
    }

    public AuthToken login(AppUser user){
        try {
            AppUser existingUser = evergreenAppUserService.getUserByEmail(user.getEmail());
            if (existingUser == null) {
                System.out.println("Empty user");
                return null;
            }

            System.out.println("User was found");

            if (!passwordEncoder.matches(user.getPassword(), existingUser.getPassword())){
                System.out.println("Invalid password");
                return new AuthToken();
            }

//            UsernamePasswordAuthenticationToken authInputToken =
//                    new UsernamePasswordAuthenticationToken(user.getEmail(), user.getPassword());
//
//            authManager.authenticate(authInputToken);



            String token = jwtUtil.generateToken(user);

            AuthToken authToken = new AuthToken();
            authToken.setToken(token);
            authToken.setUser(existingUser);

            return authToken;
        }catch (AuthenticationException authExc){
            authExc.printStackTrace();
//            throw new RuntimeException("Invalid Login Credentials");
        }
        return new AuthToken();
    }
}