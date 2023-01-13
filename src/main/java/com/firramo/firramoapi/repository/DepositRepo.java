package com.firramo.firramoapi.repository;

import com.firramo.firramoapi.model.DepositTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepositRepo extends JpaRepository<DepositTransaction, Long> {
    List<DepositTransaction> findByUserId(Long userId);
}
