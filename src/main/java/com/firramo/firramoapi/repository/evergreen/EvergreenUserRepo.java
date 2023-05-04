package com.firramo.firramoapi.repository.evergreen;

import com.firramo.firramoapi.model.evergreen.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EvergreenUserRepo extends JpaRepository<AppUser, Long> {
    Optional<AppUser> findByEmail(String email);
}
