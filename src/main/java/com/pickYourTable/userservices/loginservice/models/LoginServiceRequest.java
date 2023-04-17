package com.pickYourTable.userservices.loginservice.models;

import lombok.Data;
import io.swagger.annotations.ApiModelProperty;

@Data
public class LoginServiceRequest {
    @ApiModelProperty(value = "Login użytkownika", required = true)
    private String login;

    @ApiModelProperty(value = "Hasło użytkownika (base64)", required = true)
    private String password;
}
