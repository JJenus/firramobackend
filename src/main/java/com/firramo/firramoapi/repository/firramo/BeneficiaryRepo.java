package com.firramo.firramoapi.repository.firramo;

import com.firramo.firramoapi.model.firramo.Beneficiary;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BeneficiaryRepo extends JpaRepository<Beneficiary, Long> {
    List<Beneficiary> findByUserId(Long user);
}
