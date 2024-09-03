package com.pickYourTable.userservices.verificationcodeservice.models;

import lombok.Data;

@Data
public class VerificationCodeServiceRequest {

    private String email;
    private String code;
}
