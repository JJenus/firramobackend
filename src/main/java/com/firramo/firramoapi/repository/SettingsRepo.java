package com.firramo.firramoapi.repository;

import com.firramo.firramoapi.model.Setting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SettingsRepo extends JpaRepository<Setting, Long> {
}
