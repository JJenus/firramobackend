package com.firramo.firramoapi.repository.evergreen;

import com.firramo.firramoapi.model.evergreen.SuperPick;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EvergreenSuperPickRepo extends JpaRepository<SuperPick, Long> {
    @Query(value = "Select * from super_pick where DATE(date) = DATE(:idate) LIMIT 20", nativeQuery = true)
    List<SuperPick> findByGameDate(@Param(value = "idate") String idate);
}
