package com.pickYourTable.userservices.registerService.models;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDate;

@Data
public class RegisterServiceRequest {

    @ApiModelProperty(value = "E-mail użytkownika", required = true)
    private String email;

    @ApiModelProperty(value = "Login użytkownika", required = true)
    private String login;

    @ApiModelProperty(value = "Hasło użytkownika (base64)", required = true)
    private String password;

    @ApiModelProperty(value = "Imię użytkownika", required = true)
    private String name;

    @ApiModelProperty(value = "Nazwisko użytkownika", required = true)
    private String surname;

    @ApiModelProperty(value = "Data urodzenia użytkownika", required = true)
    private LocalDate dateOfBirth;

    @ApiModelProperty(value = "Miasto zamieszkania użytkownika", required = true)
    private String city;

}
