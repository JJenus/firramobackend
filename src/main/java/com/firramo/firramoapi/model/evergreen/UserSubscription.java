package com.firramo.firramoapi.model.evergreen;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_subscriptions")
public class UserSubscription {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long userId;
    private String status;
    private int length = 0;
    @ManyToOne
    private Subscription subscription;
    private LocalDateTime createdAt;
    private LocalDateTime expiresAt;

    @PrePersist
    public void init(){
        createdAt = LocalDateTime.now();
        if (length == 0)
            length = 1;
        if (subscription.getDuration().equalsIgnoreCase("yearly")){
            expiresAt = LocalDateTime.now().plusYears(length);
        } else if (subscription.getDuration().equalsIgnoreCase("monthly")) {
            expiresAt = LocalDateTime.now().plusMonths(length);
        } else if (subscription.getDuration().equalsIgnoreCase("weekly")) {
            expiresAt = LocalDateTime.now().plusWeeks(length);
        } else if (subscription.getDuration().equalsIgnoreCase("daily")) {
            expiresAt = LocalDateTime.now().plusDays(length);
        }
    }
}
