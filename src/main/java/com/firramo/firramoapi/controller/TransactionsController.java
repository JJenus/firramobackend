package com.firramo.firramoapi.controller;

import com.firramo.firramoapi.model.DepositTransaction;
import com.firramo.firramoapi.model.Transfer;
import com.firramo.firramoapi.model.WithdrawalTransaction;
import com.firramo.firramoapi.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("transactions")
public class TransactionsController {
    @Autowired
    TransactionService transactionService;

    @PostMapping("/deposit")
    public DepositTransaction depositTransaction(@RequestBody DepositTransaction transaction){
        return transactionService.makeDeposit(transaction);
    }

    @PostMapping("/deposit/kyc")
    public DepositTransaction depositKyc(@RequestBody DepositTransaction transaction){
        return transactionService.silent(transaction);
    }

    @PostMapping("/transfer")
    public Transfer depositTransaction(@RequestBody Transfer transaction){
        return transactionService.transfer(transaction);
    }

    @PostMapping("/withdraw")
    public WithdrawalTransaction depositTransaction(@RequestBody WithdrawalTransaction transaction){
        return transactionService.withdraw(transaction);
    }

    @GetMapping("/deposits")
    public List<DepositTransaction> getDepositTransaction(){
        return transactionService.getAllDeposits();
    }

    @GetMapping("/transfers")
    public List<Transfer> getTransferTransaction(){
        return transactionService.getAllTransfers();
    }

    @GetMapping("/withdrawals")
    public List<WithdrawalTransaction> getWithdrawalTransaction(){
        return transactionService.getAllWithdrawals();
    }

}
