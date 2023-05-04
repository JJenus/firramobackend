package com.firramo.firramoapi.service;

import com.firramo.firramoapi.model.firramo.BankCard;
import com.firramo.firramoapi.repository.firramo.BankCardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankCardService {
    @Autowired
    private BankCardRepo bankCardRepo;

    public List<BankCard> getUserCards(Long userId){
        return bankCardRepo.findByUserId(userId);
    }

    public BankCard createCard(BankCard bankCard){
//        Encrypt before saving or send already encrypted data
        return bankCardRepo.save(bankCard);
    }

    public BankCard getBankCard(Long id){
        return bankCardRepo.findById(id).orElse(null);
    }

    public List<BankCard> getAll(){
        return bankCardRepo.findAll();
    }

    public void deleteCard(Long id){
        bankCardRepo.deleteById(id);
    }
}
