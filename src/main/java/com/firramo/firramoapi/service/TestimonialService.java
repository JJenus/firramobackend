package com.firramo.firramoapi.service;

import com.firramo.firramoapi.model.Testimonial;
import com.firramo.firramoapi.repository.TestimonialRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TestimonialService {
    @Autowired
    TestimonialRepo testimonialRepo;

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
}
