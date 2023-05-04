package com.firramo.firramoapi.repository.firramo;

import com.firramo.firramoapi.model.firramo.Balance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BalanceRepo extends JpaRepository<Balance, Long> {
}
