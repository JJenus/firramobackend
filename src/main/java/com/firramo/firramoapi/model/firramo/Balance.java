package com.firramo.firramoapi.model.firramo;

import javax.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "balance")
public class Balance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String amount;
    private String currency;
    private LocalDateTime updatedAt;



    @PrePersist
    @PreUpdate
    private void update(){
        updatedAt = LocalDateTime.now();
    }
}
