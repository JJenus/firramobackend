package com.firramo.firramoapi.repository.firramo;

import com.firramo.firramoapi.model.firramo.Faq;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FAQsRepo extends JpaRepository<Faq, Long> {
}
