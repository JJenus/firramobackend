package com.firramo.firramoapi.repository.firramo;

import com.firramo.firramoapi.model.firramo.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepo extends JpaRepository<Wallet, Long> {
}
