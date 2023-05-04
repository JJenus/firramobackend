package com.firramo.firramoapi.repository.firramo;

import com.firramo.firramoapi.model.firramo.KYC;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface KYCRepo extends JpaRepository<KYC, Long> {
    Optional<KYC> findByUserId(Long userId);
}
