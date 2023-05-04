package com.firramo.firramoapi.repository.firramo;

import com.firramo.firramoapi.model.firramo.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AppUserRepo extends JpaRepository<AppUser, Long> {
    Optional<AppUser> findByEmail(String email);
}
