package com.firramo.firramoapi.controller.firramo;

import com.firramo.firramoapi.model.firramo.Setting;
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
        return settingsService.getSettings();
    }

    @PostMapping("/password")
    public void changePassword(){}

}
