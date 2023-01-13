package com.firramo.firramoapi.model;

import lombok.Data;

@Data
public class AuthToken {
    private String token;

    private LoginSession session;
    private AppUser user;
}
