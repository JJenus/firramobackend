package com.firramo.firramoapi.repository;

import com.firramo.firramoapi.model.AppUser;
import com.firramo.firramoapi.model.WithdrawalTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WithdrawalRepo extends JpaRepository<WithdrawalTransaction, Long> {
    List<WithdrawalTransaction> findByUserId(Long user);
}
