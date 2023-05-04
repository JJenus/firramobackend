package com.firramo.firramoapi.model.firramo;

import javax.persistence.*;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "beneficiary")
public class Beneficiary {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long userId;
    private Long beneficiaryId;
    private LocalDateTime createdAt;

    @PrePersist
    void init(){
        this.createdAt = LocalDateTime.now();
    }
}
