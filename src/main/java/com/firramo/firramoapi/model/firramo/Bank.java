package com.firramo.firramoapi.model.firramo;

import javax.persistence.*;

import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "bank")
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long userId;
    private String bankName;
    private String accountNumber;
    private String accountName;
    private LocalDateTime createdAt;

    @PrePersist
    void init(){
        this.createdAt = LocalDateTime.now();
    }
}
