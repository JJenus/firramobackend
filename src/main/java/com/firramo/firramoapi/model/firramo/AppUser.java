package com.firramo.firramoapi.model.firramo;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "app_user")
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
    private boolean allowTransfer;
    private String ip;

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
        status = "new";
    }

    @PreUpdate
    public void onUpdate(){
        if (status != null && status.equalsIgnoreCase("new")) {
            status = "active";
        }
        updatedAt = LocalDateTime.now();
    }

    public String getFirstName(){
        try {
            String[] names = this.name.split(" ");
            if (names.length > 1){
                return names[0];
            }
        } catch (Exception ignored){}
        return name;
    }
}
