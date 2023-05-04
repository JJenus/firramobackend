package com.firramo.firramoapi.service.evergreen;

import com.firramo.firramoapi.model.evergreen.Setting;
import com.firramo.firramoapi.repository.evergreen.EvergreenSettingsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvergreenSettingsService {
    @Autowired
    private EvergreenSettingsRepo settingsRepo;

    public Setting saveSetting(Setting setting){
        return settingsRepo.save(setting);
    }

    public Setting getSettings() {
        List<Setting> settings = settingsRepo.findAll();
        if (settings.isEmpty())
            return new Setting();
        return settings.get(0);
    }
}
