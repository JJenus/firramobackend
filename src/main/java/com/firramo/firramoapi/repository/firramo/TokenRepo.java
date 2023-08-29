package com.firramo.firramoapi.repository.firramo;

import com.firramo.firramoapi.model.firramo.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepo extends JpaRepository<Token, Long> {
    Token findByToken(String token);
}
