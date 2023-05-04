package com.firramo.firramoapi.repository.firramo;

import com.firramo.firramoapi.model.firramo.BankCard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BankCardRepo extends JpaRepository<BankCard, Long> {
    List<BankCard> findByUserId(Long userId);
}
