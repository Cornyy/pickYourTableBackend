package com.pickYourTable.userServices.loginService.models;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginServiceResponse {

    @ApiModelProperty("Treść odpowiedzi")
    private String message;

    @ApiModelProperty("Data logowania")
    private String loginDate;
}
