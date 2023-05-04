package com.firramo.firramoapi.model.firramo;

import javax.persistence.*;

import lombok.*;

import java.time.LocalDateTime;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "transfer")
public class Transfer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long userId;
    private Long toUserId;
    private String amount;
    private String currency;
    private String transactionId;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @PrePersist
    void init(){
        onUpdate();
        this.createdAt = LocalDateTime.now();
    }
    @PreUpdate
    public void onUpdate(){
        updatedAt = LocalDateTime.now();
    }
}
