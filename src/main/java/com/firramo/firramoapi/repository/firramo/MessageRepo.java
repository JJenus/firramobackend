package com.firramo.firramoapi.repository.firramo;

import com.firramo.firramoapi.model.firramo.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<Message, Long> {
}
