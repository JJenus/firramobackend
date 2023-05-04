package com.firramo.firramoapi.model.firramo;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class KYCVerification {
    private MultipartFile IDCard;
}
