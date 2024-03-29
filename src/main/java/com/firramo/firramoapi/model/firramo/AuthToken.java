package com.firramo.firramoapi.model.firramo;

import lombok.Data;

@Data
public class AuthToken {
    private String token;

    private LoginSession session;
    private AppUser user;
}
