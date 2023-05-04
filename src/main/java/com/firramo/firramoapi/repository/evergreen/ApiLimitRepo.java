package com.firramo.firramoapi.repository.evergreen;

import com.firramo.firramoapi.model.evergreen.ApiLimit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApiLimitRepo extends JpaRepository<ApiLimit, Long> {
    ApiLimit findByApiName(String name);
}
