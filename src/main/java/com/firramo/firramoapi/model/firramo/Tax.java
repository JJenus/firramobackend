package com.firramo.firramoapi.model.firramo;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tax")
public class Tax {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;
    private Long userId;
    private String amount;
    private String status;
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
