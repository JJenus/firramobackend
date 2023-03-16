package com.firramo.firramoapi.repository;

import com.firramo.firramoapi.model.Tax;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TaxRepo extends JpaRepository<Tax, Long> {
    Optional<Tax> findByUserId(Long userId);
}
