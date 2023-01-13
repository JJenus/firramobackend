package com.firramo.firramoapi.service;

import com.firramo.firramoapi.model.Setting;
import com.firramo.firramoapi.repository.SettingsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class SettingsService {
    @Autowired
    private SettingsRepo settingsRepo;

    public  Setting saveSetting(Setting setting){
        return settingsRepo.save(setting);
    }

    public Setting getSettings() {
        List<Setting> settings = settingsRepo.findAll();
        if (settings.isEmpty()) {
            return Setting.builder().currency("USD")
                    .language("EN")
                    .currencySymbol("$")
                    .createdAt(LocalDateTime.now())
                    .updatedAt(LocalDateTime.now()).build();
        }
        return settings.get(0);
    }
}
