package com.firramo.firramoapi.repository;

import com.firramo.firramoapi.model.FAQ;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FAQsRepo extends JpaRepository<FAQ, Long> {
}
