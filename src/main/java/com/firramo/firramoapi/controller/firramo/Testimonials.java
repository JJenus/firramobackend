package com.firramo.firramoapi.controller.firramo;

import com.firramo.firramoapi.model.firramo.Testimonial;
import com.firramo.firramoapi.service.firramo.TestimonialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/testimonials")
public class Testimonials {
    @Autowired
    TestimonialService testimonialService;

    @GetMapping
    List<Testimonial> get(){
        return testimonialService.get();
    }

    @PostMapping
    Testimonial create(@RequestBody Testimonial testimonial){
        return  testimonialService.save(testimonial);
    }

    @PutMapping
    Testimonial update(@RequestBody Testimonial testimonial){
        return testimonialService.update(testimonial);
    }

    @DeleteMapping("/{id}")
    void del(@PathVariable("id") Long id){
        testimonialService.del(id);
    }
}
