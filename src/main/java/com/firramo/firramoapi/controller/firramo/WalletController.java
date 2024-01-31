package com.firramo.firramoapi.controller.firramo;

import com.firramo.firramoapi.model.firramo.CryptoTransaction;
import com.firramo.firramoapi.model.firramo.UserWallet;
import com.firramo.firramoapi.model.firramo.Wallet;
import com.firramo.firramoapi.service.firramo.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/wallets")
@CrossOrigin
public class WalletController {
    @Autowired
    private WalletService walletService;

    @PostMapping
    public Wallet createWallet(@RequestBody Wallet wallet){
        return walletService.createWallet(wallet);
    }

    @GetMapping // Tested
    public List<Wallet> wallets(){
        return walletService.getWallets();
    }
    @GetMapping("/{id}") // Tested
    public List<Wallet> wallets(@PathVariable("id") Long userId){
        return walletService.getWallets(userId);
    }

    @PostMapping("/user-wallets") // Tested
    public UserWallet createWallet(@RequestBody UserWallet userWallet){
        return walletService.createUserWallet(userWallet);
    }

    @GetMapping("/user-wallets/{id}") // Tested
    public List<UserWallet> userWallets(@PathVariable("id") Long userId){
        return walletService.getUserWallets(userId);
    }

    @PostMapping("/transact")
    public UserWallet transact(@RequestBody CryptoTransaction transaction){
        return walletService.transact(transaction);
    }
}
