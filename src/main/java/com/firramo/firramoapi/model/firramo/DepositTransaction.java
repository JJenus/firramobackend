package com.firramo.firramoapi.model.firramo;

import javax.persistence.*;

import lombok.*;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "deposit_transaction")
public class DepositTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long userId;
    private String amount;
    private String transactionId;
    private String transactionRef;
    private String currency;
    private String transactionType;
    private String status;
    private String source;
    private LocalDateTime createdAt;

    @PrePersist
    void init(){
        this.createdAt = LocalDateTime.now();
    }
}
