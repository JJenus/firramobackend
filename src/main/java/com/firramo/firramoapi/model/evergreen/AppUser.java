package com.firramo.firramoapi.model.evergreen;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "app_user")
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private String password;
    private String imgUrl;
    private String status;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Role> roles;
    private LocalDateTime createdAt;

    @PrePersist
    public void init(){
        createdAt = LocalDateTime.now();
    }

}
