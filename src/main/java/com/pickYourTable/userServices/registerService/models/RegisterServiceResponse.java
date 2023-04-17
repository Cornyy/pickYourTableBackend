package com.pickYourTable.userServices.registerService.models;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RegisterServiceResponse {

    @ApiModelProperty("Treść odpowiedzi")
    private String message;

    @ApiModelProperty("Data rejestracji")
    private String registerDate;
}
