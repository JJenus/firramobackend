package com.firramo.firramoapi.repository.firramo;

import com.firramo.firramoapi.model.firramo.WithdrawalTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WithdrawalRepo extends JpaRepository<WithdrawalTransaction, Long> {
    List<WithdrawalTransaction> findByUserId(Long user);
}
