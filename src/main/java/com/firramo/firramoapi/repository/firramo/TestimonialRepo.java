package com.firramo.firramoapi.repository.firramo;

import com.firramo.firramoapi.model.firramo.Testimonial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestimonialRepo extends JpaRepository<Testimonial, Long> {
}
