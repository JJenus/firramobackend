package com.firramo.firramoapi.repository.evergreen;

import com.firramo.firramoapi.model.evergreen.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EvergreenUserRepo extends JpaRepository<AppUser, Long> {
    Optional<AppUser> findByEmail(String email);

    List<AppUser> findAllByName(String name);
}
