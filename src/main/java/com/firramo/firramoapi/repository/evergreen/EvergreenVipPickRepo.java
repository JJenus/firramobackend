package com.firramo.firramoapi.repository.evergreen;

import com.firramo.firramoapi.model.evergreen.VipPick;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvergreenVipPickRepo extends JpaRepository<VipPick, Long> {
}
