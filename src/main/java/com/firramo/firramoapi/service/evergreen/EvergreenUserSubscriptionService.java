package com.firramo.firramoapi.service.evergreen;

import com.firramo.firramoapi.model.evergreen.AppUser;
import com.firramo.firramoapi.model.evergreen.Subscription;
import com.firramo.firramoapi.model.evergreen.UserSubscription;
import com.firramo.firramoapi.repository.evergreen.EvergreenSubscriptionRepo;
import com.firramo.firramoapi.repository.evergreen.EvergreenUserRepo;
import com.firramo.firramoapi.repository.evergreen.EvergreenUserSubscriptionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvergreenUserSubscriptionService {
    @Autowired
    EvergreenUserSubscriptionRepo userSubscriptionRepo;
    @Autowired
    EvergreenSubscriptionRepo subscriptionRepo;
    @Autowired
    EvergreenUserRepo userRepo;

    public UserSubscription addSubscriptionToUser(Long userId, Long subscriptionId, int length){
        if (userId == null){
            return null;
        }
        Subscription subscription = subscriptionRepo.findById(subscriptionId).orElse(null);
        AppUser user = userRepo.findById(userId).orElse(null);

        if (subscription == null || user == null) return null;

        UserSubscription userSubscription = new UserSubscription();
        userSubscription.setSubscription(subscription);
        userSubscription.setLength(length);
        userSubscription.setUserId(userId);

        return userSubscriptionRepo.save(userSubscription);
    }

    public UserSubscription update(UserSubscription subscription){
        if (subscription.getId() == null)
            return null;
        return userSubscriptionRepo.save(subscription);
    }

    public List<UserSubscription> getAll(){
        return userSubscriptionRepo.findAll();
    }

    public List<UserSubscription> findUserSubscriptions(Long userId){
        return userSubscriptionRepo.findByUserId(userId);
    }

    public void deleteSub(Long id) {
        userSubscriptionRepo.deleteById(id);
    }
}
