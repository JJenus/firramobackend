package com.firramo.firramoapi.controller.firramo;

import com.firramo.firramoapi.model.firramo.BankCard;
import com.firramo.firramoapi.service.firramo.BankCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("cards")
public class BankCardsController {
    @Autowired
    BankCardService bankService;

    @GetMapping
    List<BankCard> get(){
        return bankService.getAll();
    }

    @PostMapping
    BankCard create(@RequestBody BankCard bankCard){
        return  bankService.createCard(bankCard);
    }

    @PutMapping
    BankCard update(@RequestBody BankCard bankCard){
        return bankService.createCard(bankCard);
    }

    @GetMapping("/{id}")
    void getCard(@PathVariable("id") Long id){
        bankService.getBankCard(id);
    }

    @DeleteMapping("/{id}")
    void del(@PathVariable("id") Long id){
        bankService.deleteCard(id);
    }
}
