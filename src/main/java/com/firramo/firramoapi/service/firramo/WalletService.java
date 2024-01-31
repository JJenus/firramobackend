package com.firramo.firramoapi.service.firramo;

import com.firramo.firramoapi.model.firramo.CryptoTransaction;
import com.firramo.firramoapi.model.firramo.UserWallet;
import com.firramo.firramoapi.model.firramo.Wallet;
import com.firramo.firramoapi.repository.firramo.CryptoHistoryRepo;
import com.firramo.firramoapi.repository.firramo.UserWalletRepo;
import com.firramo.firramoapi.repository.firramo.WalletRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class WalletService {
    @Autowired
    private WalletRepo walletRepo;
    @Autowired
    private UserWalletRepo userWalletRepo;
    @Autowired
    private CryptoHistoryRepo historyRepo;

    public Wallet createWallet(Wallet wallet){
        return walletRepo.save(wallet);
    } // Tested

    public UserWallet createUserWallet(UserWallet wallet){
        return userWalletRepo.save(wallet);
    } // Tested

    public List<UserWallet> getUserWallets(Long id){
        List<UserWallet> userWallets = userWalletRepo.findByUserId(id);
        userWallets.forEach(userWallet -> {
            double cryptoBalance = Double.parseDouble(userWallet.getCryptoBalance());
            double rate = userWallet.getWallet().getRate();
            double localBalance = cryptoBalance * rate;

            userWallet.setLocalBalance(localBalance+"");
        });
        return userWalletRepo.findByUserId(id);
    } // Tested

    public void deleteWallet(Long id){
        walletRepo.deleteById(id);
    }

    public UserWallet transact(CryptoTransaction transaction){
        double balance;
        UserWallet userWallet = userWalletRepo.findByUserIdAndWalletId(transaction.getUserId(), transaction.getWalletId());

        double userBalance = Double.parseDouble(userWallet.getCryptoBalance());
        double amount = Double.parseDouble(transaction.getAmount());

        if (transaction.getType().equalsIgnoreCase("sent")){
            if (userBalance < amount){
                return  userWallet;
            }
            balance = userBalance - amount;
        }
        else {
            balance = userBalance + amount;
        }

        userWallet.setCryptoBalance(balance+"");
        double cryptoBalance = Double.parseDouble(userWallet.getCryptoBalance());
        double rate = userWallet.getWallet().getRate();
        double localBalance = cryptoBalance * rate;

        userWallet.setLocalBalance(localBalance+"");

        CryptoTransaction history = historyRepo.save(transaction);
        userWallet.getHistory().add(history);
        userWalletRepo.save(userWallet);

        return userWallet;
    }

    public List<Wallet> getWallets() {
        return walletRepo.findAll();
    }

    public List<Wallet> getWallets(Long userId) {
        List<Wallet> wallets = walletRepo.findAll();

        getUserWallets(userId).forEach(userWallet -> {
            wallets.removeIf(wallet -> Objects.equals(wallet.getId(), userWallet.getWallet().getId()));
        });

        return wallets;
    }
}
