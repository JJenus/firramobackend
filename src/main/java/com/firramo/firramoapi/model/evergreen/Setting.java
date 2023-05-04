package com.firramo.firramoapi.model.evergreen;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "settings")
public class Setting {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String email;
    private String telegramLink;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @PrePersist
    public void onCreated(){
        createdAt = LocalDateTime.now();
        onUpdate();
    }

    @PostPersist
    public void onUpdate(){
        updatedAt = LocalDateTime.now();
    }
}
