package com.firramo.firramoapi.repository.evergreen;

import com.firramo.firramoapi.model.evergreen.FAQ;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvergreenFAQsRepo extends JpaRepository<FAQ, Long> {
}
