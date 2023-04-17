package com.pickYourTable.userservices.verificationcodeservice.models;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class VerificationCodeServiceRequest {

    @ApiModelProperty(value = "Adres e-mail", required = true)
    private String email;

    @ApiModelProperty(value = "Kod weryfikacyjny", required = true)
    private String code;
}
