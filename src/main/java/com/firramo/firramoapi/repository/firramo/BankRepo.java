package com.firramo.firramoapi.repository.firramo;

import com.firramo.firramoapi.model.firramo.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BankRepo extends JpaRepository<Bank, Long> {
    List<Bank> findByUserId(Long user);
}
