package com.firramo.firramoapi.service.firramo;

import com.firramo.firramoapi.model.firramo.Faq;
import com.firramo.firramoapi.repository.firramo.FAQsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FAQsService {
    @Autowired
    FAQsRepo faQsRepo;

    public List<Faq> getFAQs(){
        return faQsRepo.findAll();
    }

    public Faq getFaQ(Long id){
        return faQsRepo.findById(id).orElse(null);
    }

    public Faq saveFaQ(Faq FAQ){
        return faQsRepo.save(FAQ);
    }

    public Faq update(Faq FAQ){
        Optional<Faq> optionalFAQs = faQsRepo.findById(FAQ.getId());
        if (!optionalFAQs.isPresent())
            return null;
        return faQsRepo.save(FAQ);
    }

    public void delFaq(Faq FAQ){
        faQsRepo.delete(FAQ);
    }

    public void delFaq(Long id){
        faQsRepo.deleteById(id);
    }
}
