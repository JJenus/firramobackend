package com.firramo.firramoapi.repository;

import com.firramo.firramoapi.model.Testimonial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestimonialRepo extends JpaRepository<Testimonial, Long> {
}
