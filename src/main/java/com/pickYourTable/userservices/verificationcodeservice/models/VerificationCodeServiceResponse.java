package com.pickYourTable.userservices.verificationcodeservice.models;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VerificationCodeServiceResponse {
    @ApiModelProperty("Treść odpowiedzi")
    private String message;
}
