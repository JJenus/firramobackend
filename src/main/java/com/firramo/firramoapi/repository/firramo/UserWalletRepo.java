package com.firramo.firramoapi.repository.firramo;

import com.firramo.firramoapi.model.firramo.CryptoTransaction;
import com.firramo.firramoapi.model.firramo.UserWallet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserWalletRepo extends JpaRepository<UserWallet, Long> {
    List<UserWallet> findByUserId(Long id);
    UserWallet findByUserIdAndWalletId(Long userId, Long walletId);
}
