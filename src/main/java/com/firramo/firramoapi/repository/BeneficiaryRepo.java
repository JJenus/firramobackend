package com.firramo.firramoapi.repository;

import com.firramo.firramoapi.model.Beneficiary;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BeneficiaryRepo extends JpaRepository<Beneficiary, Long> {
    List<Beneficiary> findByUserId(Long user);
}
