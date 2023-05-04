package com.firramo.firramoapi.controller.evergreen;

import com.firramo.firramoapi.model.evergreen.Subscription;
import com.firramo.firramoapi.service.evergreen.EvergreenSubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/evergreen/subscriptions")
public class EvergreenSubscriptions {
    @Autowired
    EvergreenSubscriptionService evergreenSubscriptionService;

    @GetMapping
    List<Subscription> getSubscriptions(@RequestParam(value = "type", defaultValue = "all") String type){
        if (!type.equalsIgnoreCase("all")){
            return evergreenSubscriptionService.getSubscriptions(type);
        }
        return evergreenSubscriptionService.getSubscriptions();
    }

    @PostMapping
    Subscription create(@RequestBody Subscription subscription){
        return evergreenSubscriptionService.save(subscription);
    }

    @PutMapping
    Subscription update(@RequestBody Subscription subscription){
        return evergreenSubscriptionService.update(subscription);
    }

    @DeleteMapping("{id}")
    void del(@PathVariable("id") Long id){
        evergreenSubscriptionService.del(id);
    }
}
