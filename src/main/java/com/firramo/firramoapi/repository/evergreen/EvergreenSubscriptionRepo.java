package com.firramo.firramoapi.repository.evergreen;

import com.firramo.firramoapi.model.evergreen.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EvergreenSubscriptionRepo extends JpaRepository<Subscription, Long> {
    List<Subscription> findByType(String type);
}
