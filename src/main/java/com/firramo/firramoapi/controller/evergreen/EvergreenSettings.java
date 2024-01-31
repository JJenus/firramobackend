package com.firramo.firramoapi.controller.evergreen;

import com.firramo.firramoapi.model.evergreen.EvergreenRoleType;
import com.firramo.firramoapi.model.evergreen.Setting;
import com.firramo.firramoapi.service.evergreen.EvergreenSettingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/evergreen/settings")
public class EvergreenSettings {
    @Autowired
    private EvergreenSettingsService evergreenSettingsService;

    @PostMapping
    public Setting setting(@RequestBody Setting setting){
        return evergreenSettingsService.saveSetting(setting);
    }

    @GetMapping
    public Setting getSettings(){
        System.out.println(EvergreenRoleType.ADMIN);
        return evergreenSettingsService.getSettings();
    }

    @PostMapping("/password")
    public void changePassword(){}

}
