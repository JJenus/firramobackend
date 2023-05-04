package com.firramo.firramoapi.repository.evergreen;

import com.firramo.firramoapi.model.evergreen.Setting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvergreenSettingsRepo extends JpaRepository<Setting, Long> {
}
