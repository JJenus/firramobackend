package com.firramo.firramoapi.repository.evergreen;

import com.firramo.firramoapi.model.evergreen.FreePick;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EvergreenFreePickRepo extends JpaRepository<FreePick, Long> {
    @Query(value = "Select * from free_pick where DATE(start_date) = DATE(:idate) LIMIT 20", nativeQuery = true)
    List<FreePick> findByGameDate(@Param(value = "idate") String idate);
}
