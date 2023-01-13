package com.firramo.firramoapi.repository;

import com.firramo.firramoapi.model.Balance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BalanceRepo extends JpaRepository<Balance, Long> {
}
