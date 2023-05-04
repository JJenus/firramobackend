package com.firramo.firramoapi.repository.firramo;

import com.firramo.firramoapi.model.firramo.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepo extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}
