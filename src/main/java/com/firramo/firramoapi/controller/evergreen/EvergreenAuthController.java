package com.firramo.firramoapi.controller.evergreen;

import com.firramo.firramoapi.model.evergreen.AppUser;
import com.firramo.firramoapi.model.evergreen.AuthToken;
import com.firramo.firramoapi.service.evergreen.EvergreenAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

@CrossOrigin
@RestController
@RequestMapping("/evergreen/auth")
public class EvergreenAuthController {
    @Autowired
    EvergreenAuthService evergreenAuthService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody AppUser user){

        AuthToken res = evergreenAuthService.login(user);
        if (res == null){
            return ResponseEntity.ok(Collections.singletonMap("error", "User doesn't exist"));
        }
        if (res.getToken() == null){
            return ResponseEntity.ok(Collections.singletonMap("error", "Invalid password"));
        }

        return ResponseEntity.ok(res);
    }

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody AppUser user){
        AuthToken res = evergreenAuthService.registerUser(user);

        if (res == null){
            return ResponseEntity.ok(Collections.singletonMap("error", "Email already exists"));
        }
        return ResponseEntity.ok(res);
    }
}
