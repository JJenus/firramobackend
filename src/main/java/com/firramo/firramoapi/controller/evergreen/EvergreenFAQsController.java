package com.firramo.firramoapi.controller.evergreen;

import com.firramo.firramoapi.model.evergreen.FAQ;
import com.firramo.firramoapi.service.evergreen.EvergreenFAQsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/evergreen/faqs")
public class EvergreenFAQsController {
    @Autowired
    EvergreenFAQsService evergreenFaQsService;

    @GetMapping
    List<FAQ> getFAQs(){
        return evergreenFaQsService.getFAQs();
    }

    @PostMapping
    FAQ create(@RequestBody FAQ faq){
        return evergreenFaQsService.saveFaQ(faq);
    }

    @PutMapping
    FAQ update(@RequestBody FAQ faq){
        return evergreenFaQsService.update(faq);
    }

    @DeleteMapping("/{id}")
    void del(@PathVariable Long id){
        evergreenFaQsService.delFaq(id);
    }
}
