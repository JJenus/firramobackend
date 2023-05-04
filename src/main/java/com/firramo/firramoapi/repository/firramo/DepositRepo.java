package com.firramo.firramoapi.repository.firramo;

import com.firramo.firramoapi.model.firramo.DepositTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepositRepo extends JpaRepository<DepositTransaction, Long> {
    List<DepositTransaction> findByUserId(Long userId);
}
