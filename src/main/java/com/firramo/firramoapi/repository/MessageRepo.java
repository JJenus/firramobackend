package com.firramo.firramoapi.repository;

import com.firramo.firramoapi.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<Message, Long> {
}
