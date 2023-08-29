package com.firramo.firramoapi.repository.evergreen;

import com.firramo.firramoapi.model.evergreen.Subscription;
import com.firramo.firramoapi.model.evergreen.UserSubscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@EnableTransactionManagement
public interface EvergreenUserSubscriptionRepo extends JpaRepository<UserSubscription, Long> {
    List<UserSubscription> findByUserId(Long userId);

    @Modifying(clearAutomatically = true)
    @Transactional(transactionManager = "evergreenTransactionManager")
    void deleteBySubscription(Subscription subscription);
}
