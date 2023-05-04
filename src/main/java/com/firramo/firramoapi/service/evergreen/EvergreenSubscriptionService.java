package com.firramo.firramoapi.service.evergreen;

import com.firramo.firramoapi.model.evergreen.Subscription;
import com.firramo.firramoapi.repository.evergreen.EvergreenSubscriptionRepo;
import com.firramo.firramoapi.repository.evergreen.EvergreenUserSubscriptionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EvergreenSubscriptionService {
    @Autowired
    EvergreenSubscriptionRepo subscriptionRepo;
    @Autowired
    EvergreenUserSubscriptionRepo userSubscriptionRepo;

    public List<Subscription> getSubscriptions(){
        return subscriptionRepo.findAll();
    }
    public List<Subscription> getSubscriptions(String type){
        return subscriptionRepo.findByType(type);
    }

    public Subscription getSubscription(Long id){
        return subscriptionRepo.findById(id).orElse(null);
    }

    public Subscription save(Subscription Subscription){
        return subscriptionRepo.save(Subscription);
    }

    public Subscription update(Subscription subscription){
        Optional<Subscription> optionalSubscription = subscriptionRepo.findById(subscription.getId());
        if (!optionalSubscription.isPresent())
            return null;
        return subscriptionRepo.save(subscription);
    }

    public void del(Subscription Subscription){
        subscriptionRepo.delete(Subscription);
    }

    public void del(Long id){
        Subscription subscription = getSubscription(id);
//        userSubscriptionRepo.deleteBySubscription(subscription);
        userSubscriptionRepo.deleteSubscription(id);
        subscriptionRepo.deleteById(id);
    }
}
