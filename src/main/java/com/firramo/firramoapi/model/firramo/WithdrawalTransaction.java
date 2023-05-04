package com.firramo.firramoapi.model.firramo;

import javax.persistence.*;

import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "withdrawal_transaction")
public class WithdrawalTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long userId;
    private String amount;
    private String currency;
    private String transactionRef;
    private String status;
    private String destinationType;
    private Long destinationId;
    private LocalDateTime createdAt;

    @PrePersist
    void init(){
        this.createdAt = LocalDateTime.now();
    }
}
