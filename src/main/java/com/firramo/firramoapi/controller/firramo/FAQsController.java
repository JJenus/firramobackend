package com.firramo.firramoapi.controller.firramo;

import com.firramo.firramoapi.model.firramo.Faq;
import com.firramo.firramoapi.service.firramo.FAQsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/faqs")
public class FAQsController {
    @Autowired
    FAQsService faQsService;

    @GetMapping
    List<Faq> getFAQs(){
        return faQsService.getFAQs();
    }

    @PostMapping
    Faq create(@RequestBody Faq faq){
        return faQsService.saveFaQ(faq);
    }

    @PutMapping
    Faq update(@RequestBody Faq faq){
        return faQsService.update(faq);
    }

    @DeleteMapping("/{id}")
    void del(@PathVariable Long id){
        faQsService.delFaq(id);
    }
}
