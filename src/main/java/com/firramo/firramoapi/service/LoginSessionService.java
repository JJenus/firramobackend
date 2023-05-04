package com.firramo.firramoapi.service;

import com.firramo.firramoapi.model.firramo.LoginSession;
import com.firramo.firramoapi.repository.firramo.LoginSessionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginSessionService {
    @Autowired
    LoginSessionRepo sessionRepo;

    public LoginSession save(LoginSession session){
        return sessionRepo.save(session);
    }

    List<LoginSession> loginSessionsByUser(Long userId){
        return sessionRepo.findByUserId(userId);
    }
}
