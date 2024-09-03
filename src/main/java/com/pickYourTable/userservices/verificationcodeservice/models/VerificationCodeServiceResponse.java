package com.pickYourTable.userservices.verificationcodeservice.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VerificationCodeServiceResponse {
    private String message;
}
