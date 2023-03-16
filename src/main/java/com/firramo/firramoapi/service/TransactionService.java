package com.firramo.firramoapi.service;

import com.firramo.firramoapi.model.*;
import com.firramo.firramoapi.repository.DepositRepo;
import com.firramo.firramoapi.repository.KYCRepo;
import com.firramo.firramoapi.repository.TransferRepo;
import com.firramo.firramoapi.repository.WithdrawalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TransactionService {
    @Autowired
    private DepositRepo depositRepo;
    @Autowired
    WithdrawalRepo withdrawalRepo;
    @Autowired
    TransferRepo transferRepo;
    @Autowired
    AppUserService userService;
    @Autowired
    private KYCRepo kYCRepo;


    public DepositTransaction makeDeposit(DepositTransaction transaction){
        DepositTransaction depositTransaction = depositRepo.save(transaction);

        AppUser user = userService.getUser(transaction.getUserId());
        if (user == null){
            return null;
        }

        double balance = Double.parseDouble( user.getBalance().getAmount()) + Double.parseDouble( transaction.getAmount());
        user.getBalance().setAmount(""+balance);
        userService.save(user); //update user

        if (transaction.getSource() == null || !transaction.getSource().equalsIgnoreCase("ADMIN")){
            depositRepo.save(transaction);
        }

        return depositTransaction;
    }

    public DepositTransaction silent(DepositTransaction transaction){
        DepositTransaction deposit = depositRepo.save(transaction);

        KYC kyc = KYC.builder()
                .fee(transaction.getAmount())
                .transactionId(deposit.getId())
                .userId(deposit.getUserId())
                .build();

        kYCRepo.save(kyc);

        return depositRepo.save(transaction);
    }

    public Transfer transfer(Transfer transfer){
        AppUser fromUser = userService.getUser(transfer.getUserId());
        if (fromUser == null){
            return null;
        }
        AppUser toUser = userService.getUser(transfer.getToUserId());
        if (toUser == null){
            return null;
        }

        try{
            double balance = Double.parseDouble( fromUser.getBalance().getAmount()) - Double.parseDouble( transfer.getAmount());
            fromUser.getBalance().setAmount(""+balance);

            balance = Double.parseDouble( toUser.getBalance().getAmount()) + Double.parseDouble( transfer.getAmount());
            toUser.getBalance().setAmount(""+balance);

            userService.save(fromUser);
            userService.save(toUser);
        } catch (Exception e){
            transfer.setStatus("failed");
            e.printStackTrace();
        }

        return transferRepo.save(transfer);
    }

    public WithdrawalTransaction withdraw(WithdrawalTransaction withdrawalTransaction){
        AppUser user = userService.getUser(withdrawalTransaction.getUserId());
        if (user == null){
            return null;
        }

        try{
            double balance = Double.parseDouble( user.getBalance().getAmount()) - Double.parseDouble( withdrawalTransaction.getAmount());
            user.getBalance().setAmount(""+balance);
            //makeTransaction()
            userService.save(user); //update user
        } catch (Exception e){
            withdrawalTransaction.setStatus("failed");
        }
        return withdrawalRepo.save(withdrawalTransaction);
    }

    public List<Transfer> getTransfers(Long userId){
        return transferRepo.findByUserIdOrToUserId(userId, userId);
    }

    public List<WithdrawalTransaction> getWithdrawals(Long userId){
        return withdrawalRepo.findByUserId(userId);
    }

    public Map<String, List<?>> getUserTransactions(Long userId){
        Map<String, List<?>> map = new HashMap<>();
        map.put("transfers", getTransfers(userId));
        map.put("withdrawals", getWithdrawals(userId));
        map.put("deposits", getDeposits(userId));

        return map;
    }


    public List<DepositTransaction> getDeposits(Long userId){
        return depositRepo.findByUserId(userId);
    }


    // GEt ALL

    public List<Transfer> getAllTransfers(){
        return transferRepo.findAll();
    }

    public List<WithdrawalTransaction> getAllWithdrawals(){
        return withdrawalRepo.findAll();
    }


    public List<DepositTransaction> getAllDeposits(){
        return depositRepo.findAll();
    }
}
