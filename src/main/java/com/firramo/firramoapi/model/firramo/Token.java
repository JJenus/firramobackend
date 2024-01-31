package com.firramo.firramoapi.model.firramo;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
public class Token {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long userId;
    private String token;
    private boolean used;
    private LocalDateTime expiresAt;

    @PrePersist
    public void onInsert(){
        used = false;
    }
}
