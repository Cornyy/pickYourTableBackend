package com.pickYourTable.userservices.loginservice.models;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginServiceResponse {
    private String message;
    private String loginDate;
}
