package com.firramo.firramoapi.controller.firramo;

import com.firramo.firramoapi.model.firramo.*;
import com.firramo.firramoapi.repository.firramo.KYCRepo;
import com.firramo.firramoapi.service.firramo.AppUserService;
import com.firramo.firramoapi.service.firramo.AuthService;
import com.firramo.firramoapi.service.firramo.BankCardService;
import com.firramo.firramoapi.service.firramo.TransactionService;
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
    public List<AppUser> appUsers(@RequestParam(value = "page", defaultValue = "1") int page){
        return appUserService.getUsers();
    }

    @GetMapping("/valid")
    public List<AppUser> getNotDeletedUsers(){
        return appUserService.getNotDeletedUsers();
    }
    @GetMapping("/page/{page}")
    public List<AppUser> appAllUsers(@PathVariable int page){
        return appUserService.getUsersByPage(page);
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
    public Map<String, List<?>> getTransactions(@PathVariable("id") Long id){
        return transactionService.getUserTransactions(id);
    }

    @GetMapping("/{id}/cards")
    public List<BankCard> getCards(@PathVariable("id") Long id){
        return bankCardService.getUserCards(id);
    }

    @PostMapping("/verify")
    public FirramoResponse verify(@RequestBody KYC verification){
        return appUserService.verify(verification);
    }

    @GetMapping("/{id}/kyc")
    public KYC getVer(@PathVariable("id") Long id){
        return kYCRepo.findByUserId(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Long id){
        appUserService.deleteUser(id);
    }

    @DeleteMapping
    public void deleteUser(@RequestBody AppUser user){
        appUserService.softDelete(user);
    }

    @GetMapping("/{id}")
    public AppUser getUser(@PathVariable("id") Long id){
        return appUserService.getUser(id);
    }

    @GetMapping("/{id}/tax")
    public Tax getTax(@PathVariable("id") Long id){
        return appUserService.getTax(id);
    }

    @PostMapping("/tax")
    public Tax saveTax(@RequestBody Tax tax){
        return appUserService.saveTax(tax);
    }

    @PostMapping("/allow-transfer")
    public void allowTransfer(@RequestBody AppUser user){
        appUserService.update(user);
    }

    @GetMapping("/search")
    public List<AppUser> searchByEmailOrName(@RequestParam("q") String q) {
        return appUserService.search(q);
    }
}
