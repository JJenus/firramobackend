package com.firramo.firramoapi.model.firramo;

import javax.persistence.*;

import lombok.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter @Getter
@Table(name = "bank_card")
public class BankCard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long userId;
    private String number;
    private String cvv;
    private String exp;
}
