package com.firramo.firramoapi.model.firramo;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class FirramoResponse {
    private String status;
    private String message;
}
