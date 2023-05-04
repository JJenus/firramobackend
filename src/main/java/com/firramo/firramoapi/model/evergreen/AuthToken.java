package com.firramo.firramoapi.model.evergreen;

import lombok.Data;

import javax.persistence.Table;

@Data
public class AuthToken {
    private String token;
    private AppUser user;
}
