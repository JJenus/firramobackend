package com.firramo.firramoapi.repository.evergreen;

import com.firramo.firramoapi.model.evergreen.Winner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvergreenWinnerRepo extends JpaRepository<Winner, Long> {
}
