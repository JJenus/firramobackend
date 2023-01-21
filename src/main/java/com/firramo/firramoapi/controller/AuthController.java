package com.firramo.firramoapi.controller;

import com.firramo.firramoapi.model.AppUser;
import com.firramo.firramoapi.model.AuthToken;
import com.firramo.firramoapi.model.ChangePassword;
import com.firramo.firramoapi.model.LoginSession;
import com.firramo.firramoapi.repository.LoginSessionRepo;
import com.firramo.firramoapi.service.AuthService;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    AuthService authService;
    @Autowired
    private LoginSessionRepo loginSessionRepo;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody AppUser user, HttpServletRequest request){
        AuthToken res = authService.login(user);
        if (res == null){
            return ResponseEntity.ok(Collections.singletonMap("error", "User doesn't exist"));
        }
        if (res.getToken() == null){
            return ResponseEntity.ok(Collections.singletonMap("error", "Invalid password"));
        }

        LoginSession session = authService.logSession(res.getUser(), request);
        res.setSession(session);

        return ResponseEntity.ok(res);
    }

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody AppUser user, HttpServletRequest request){

        AuthToken res = authService.registerUser(user);

        if (res == null){
            return ResponseEntity.ok(Collections.singletonMap("error", "Email already exists"));
        }

        LoginSession session = authService.logSession(res.getUser(), request);
        res.setSession(session);

        return ResponseEntity.ok(res);
    }

    @DeleteMapping("/sessions/{id}")
    public void deleteSession(@PathVariable("id") Long id){
        loginSessionRepo.deleteById(id);
    }

    @PostMapping("/change-password")
    public Map<String, String> changePassword(@RequestBody ChangePassword changePassword){
        return authService.changePassword(changePassword);
    }
}
