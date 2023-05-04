package com.firramo.firramoapi.repository.firramo;

import com.firramo.firramoapi.model.firramo.LoginSession;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LoginSessionRepo extends JpaRepository<LoginSession, Long> {
    Optional<LoginSession> findByDeviceId(String id);
    List<LoginSession> findByUserId(Long id);
}
