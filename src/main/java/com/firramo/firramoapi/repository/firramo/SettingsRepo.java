package com.firramo.firramoapi.repository.firramo;

import com.firramo.firramoapi.model.firramo.Setting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SettingsRepo extends JpaRepository<Setting, Long> {
}
