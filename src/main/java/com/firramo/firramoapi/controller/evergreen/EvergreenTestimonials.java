package com.firramo.firramoapi.controller.evergreen;

import com.firramo.firramoapi.model.evergreen.Testimonial;
import com.firramo.firramoapi.model.evergreen.Winner;
import com.firramo.firramoapi.service.evergreen.EvergreenTestimonialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/evergreen/testimonials")
public class EvergreenTestimonials {
    @Autowired
    EvergreenTestimonialService evergreenTestimonialService;

    @GetMapping
    List<Testimonial> get(){
        return evergreenTestimonialService.get();
    }

    @PostMapping
    Testimonial create(@RequestBody Testimonial testimonial){
        return  evergreenTestimonialService.save(testimonial);
    }

    @PutMapping
    Testimonial update(@RequestBody Testimonial testimonial){
        return evergreenTestimonialService.update(testimonial);
    }

    @DeleteMapping("/{id}")
    void del(@PathVariable("id") Long id){
        evergreenTestimonialService.del(id);
    }

    @GetMapping("/won")
    List<Winner> getWon(){
        return evergreenTestimonialService.getWinners();
    }

    @PostMapping("/won")
    Winner createWon(@RequestBody Winner winner){
        return  evergreenTestimonialService.saveWon(winner);
    }

    @DeleteMapping("/won/{id}")
    void delWon(@PathVariable("id") Long id){
        evergreenTestimonialService.delWinner(id);
    }
}
