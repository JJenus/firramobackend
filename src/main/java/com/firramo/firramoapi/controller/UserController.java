package com.firramo.firramoapi.controller;

import com.firramo.firramoapi.model.*;
import com.firramo.firramoapi.repository.KYCRepo;
import com.firramo.firramoapi.service.AppUserService;
import com.firramo.firramoapi.service.AuthService;
import com.firramo.firramoapi.service.BankCardService;
import com.firramo.firramoapi.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private AppUserService appUserService;
    @Autowired
    TransactionService transactionService;

    @Autowired
    AuthService authService;

    @Autowired
    BankCardService bankCardService;
    @Autowired
    private KYCRepo kYCRepo;

    @GetMapping
    public List<AppUser> appUsers(){
        return appUserService.getUsers();
    }

    @PutMapping
    public AppUser update(@RequestBody AppUser appUser){
        return appUserService.update(appUser);
    }

    @GetMapping("/{id}/sessions")
    ResponseEntity<List<LoginSession>> getLoggedInSession(@PathVariable("id") Long userId){
        return ResponseEntity.ok(authService.getSessions(userId));
    }

    @PostMapping("/deposit")
    public DepositTransaction depositTransaction(@RequestBody DepositTransaction transaction){
        return transactionService.makeDeposit(transaction);
    }

    @PostMapping("/transfer")
    public Transfer depositTransaction(@RequestBody Transfer transaction){
        return transactionService.transfer(transaction);
    }

    @PostMapping("/withdraw")
    public WithdrawalTransaction depositTransaction(@RequestBody WithdrawalTransaction transaction){
        return transactionService.withdraw(transaction);
    }

    @GetMapping("/{id}/transactions")
    public Map<String, List<?>> getTransactions(@PathVariable Long id){
        return transactionService.getUserTransactions(id);
    }

    @GetMapping("/{id}/cards")
    public List<BankCard> getCards(@PathVariable Long id){
        return bankCardService.getUserCards(id);
    }

    @PostMapping("/verify")
    public FirramoResponse verify(@RequestBody KYC verification){
        return appUserService.verify(verification);
    }

    @GetMapping("/{id}/kyc")
    public KYC getVer(@PathVariable Long id){
        return kYCRepo.findByUserId(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id){
        appUserService.deleteUser(id);
    }
}
