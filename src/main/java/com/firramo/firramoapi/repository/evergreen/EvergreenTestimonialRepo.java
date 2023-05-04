package com.firramo.firramoapi.repository.evergreen;

import com.firramo.firramoapi.model.evergreen.Testimonial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvergreenTestimonialRepo extends JpaRepository<Testimonial, Long> {
}
