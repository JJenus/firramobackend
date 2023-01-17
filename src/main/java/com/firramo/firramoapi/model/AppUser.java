package com.firramo.firramoapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private String country;
    private String state;
    private String city;
    private String zipcode;
    private String address;
    private String password;
    private String phone;
    private String imgUrl;
    private String status;
    @OneToOne
    @JoinColumn(name = "balance_id")
    private Balance balance;
    @ManyToMany
    private List<Role> roles;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @PrePersist
    public void onInsert(){
        createdAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    public void onUpdate(){
        updatedAt = LocalDateTime.now();
    }
}
