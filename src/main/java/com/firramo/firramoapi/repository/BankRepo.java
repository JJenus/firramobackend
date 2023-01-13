package com.firramo.firramoapi.repository;

import com.firramo.firramoapi.model.AppUser;
import com.firramo.firramoapi.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BankRepo extends JpaRepository<Bank, Long> {
    List<Bank> findByUserId(Long user);
}
