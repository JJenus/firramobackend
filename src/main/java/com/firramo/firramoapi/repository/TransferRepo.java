package com.firramo.firramoapi.repository;

import com.firramo.firramoapi.model.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransferRepo extends JpaRepository<Transfer, Long> {
    List<Transfer> findByUserId(Long userId);
    List<Transfer> findByToUserId(Long userId);

    List<Transfer> findByUserIdOrToUserId(Long userId, Long toUserId);
}
