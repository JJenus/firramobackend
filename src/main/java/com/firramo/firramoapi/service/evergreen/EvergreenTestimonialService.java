package com.firramo.firramoapi.service.evergreen;

import com.firramo.firramoapi.model.evergreen.Testimonial;
import com.firramo.firramoapi.model.evergreen.Winner;
import com.firramo.firramoapi.repository.evergreen.EvergreenTestimonialRepo;
import com.firramo.firramoapi.repository.evergreen.EvergreenWinnerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EvergreenTestimonialService {
    @Autowired
    EvergreenTestimonialRepo testimonialRepo;
    @Autowired
    private EvergreenWinnerRepo winnerRepo;

    public List<Testimonial> get(){
        return testimonialRepo.findAll();
    }

    public Testimonial save(Testimonial testimonial){
        return  testimonialRepo.save(testimonial);
    }

    public Testimonial update(Testimonial testimonial){
        Optional<Testimonial> optionalTestimonial = testimonialRepo.findById(testimonial.getId());
        if (!optionalTestimonial.isPresent()) {
            return null;
        }
        return  testimonialRepo.save(testimonial);
    }

    public void del(Long id){
        testimonialRepo.deleteById(id);
    }

    public Winner saveWon(Winner winner) {
        return winnerRepo.save(winner);
    }

    public List<Winner> getWinners() {
        return winnerRepo.findAll();
    }

    public void delWinner(Long id){
        winnerRepo.deleteById(id);
    }
}
