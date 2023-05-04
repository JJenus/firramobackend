package com.firramo.firramoapi.controller.evergreen;

import com.firramo.firramoapi.model.evergreen.SubscribeUser;
import com.firramo.firramoapi.model.evergreen.UserSubscription;
import com.firramo.firramoapi.service.evergreen.EvergreenUserSubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/evergreen/user-subscriptions")
public class EvergreenUserSubscriptionController {
    @Autowired
    EvergreenUserSubscriptionService evergreenUserSubscriptionService;
    @PostMapping
    public ResponseEntity<?> subscribeUser(@RequestBody SubscribeUser subscribeUser){
        UserSubscription userSubscription = evergreenUserSubscriptionService.addSubscriptionToUser(
                subscribeUser.getUserId()   ,
                subscribeUser.getSubscriptionId(),
                subscribeUser.getLength());

        if (userSubscription == null){
            return ResponseEntity.ok(Collections.singletonMap("error", "invalid credentials"));
        }

        return ResponseEntity.ok(userSubscription);
    }

    @GetMapping("/{userId}")
    public List<UserSubscription> userSubscriptions(@PathVariable("userId") Long userId){
        return evergreenUserSubscriptionService.findUserSubscriptions(userId);
    }

    @GetMapping
    public List<UserSubscription> getAll(){
        return evergreenUserSubscriptionService.getAll();
    }

    @PutMapping
    public ResponseEntity<?> updateSubscription(@RequestBody UserSubscription subscription){
        UserSubscription userSubscription =  evergreenUserSubscriptionService.update(subscription);

        if (userSubscription == null){
            return ResponseEntity.ok(Collections.singletonMap("error", "invalid Id"));
        }

        return ResponseEntity.ok(userSubscription);
    }

    @DeleteMapping("/{id}")
    public void deleSub(@PathVariable("id") Long id){
        evergreenUserSubscriptionService.deleteSub(id);
    }
}
