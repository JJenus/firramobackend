package com.firramo.firramoapi.repository;

import com.firramo.firramoapi.model.BankCard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BankCardRepo extends JpaRepository<BankCard, Long> {
    List<BankCard> findByUserId(Long userId);
}
