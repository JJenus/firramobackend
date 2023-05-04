package com.firramo.firramoapi.model.firramo;

import lombok.Data;

import javax.persistence.Table;

@Data
@Table(name = "change_password")
public class ChangePassword {
    private Long userId;
    private String currentPassword;
    private String newPassword;
    private String confirmPassword;
}
