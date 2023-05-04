package com.firramo.firramoapi.model.firramo;

import javax.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "login_session")
public class LoginSession {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long userId;
    private String city;
    private String country;
    private String device;
    private String deviceId;
    private String browser;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @PrePersist
    void init (){
        updatedAt = createdAt = LocalDateTime.now();
    }

    @PreUpdate
    void update(){
        updatedAt = LocalDateTime.now();
    }
}
