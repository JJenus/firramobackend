package com.firramo.firramoapi.controller.evergreen;

import com.firramo.firramoapi.model.evergreen.AppUser;
import com.firramo.firramoapi.service.evergreen.EvergreenAppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/evergreen/users")
public class EvergreenUserController {
    @Autowired
    private EvergreenAppUserService evergreenAppUserService;

    @GetMapping
    public List<AppUser> appUsers(){
        return evergreenAppUserService.getUsers();
    }

    @PutMapping
    public AppUser update(@RequestBody AppUser appUser){
        return evergreenAppUserService.update(appUser);
    }

    @GetMapping("/{id}")
    public AppUser getUser(@PathVariable("id") Long id){
        return evergreenAppUserService.getUser(id);
    }
}
