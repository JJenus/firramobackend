package com.firramo.firramoapi.controller;

import com.firramo.firramoapi.model.ROLE;
import com.firramo.firramoapi.model.Setting;
import com.firramo.firramoapi.service.SettingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("settings")
public class Settings {
    @Autowired
    private SettingsService settingsService;

    @PostMapping
    public Setting setting(@RequestBody Setting setting){
        return settingsService.saveSetting(setting);
    }

    @GetMapping
    public Setting getSettings(){
        System.out.println(ROLE.ADMIN);
        return settingsService.getSettings();
    }

    @PostMapping("/password")
    public void changePassword(){}

}
