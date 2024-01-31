package com.firramo.firramoapi.repository.firramo;

import com.firramo.firramoapi.model.firramo.CryptoTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CryptoHistoryRepo extends JpaRepository<CryptoTransaction, Long> {
    List<CryptoTransaction> findByUserId(Long id);
}
