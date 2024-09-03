package com.pickYourTable.userservices.loginservice.models;

import lombok.Data;

@Data
public class LoginServiceRequest {
    private String login;
    private String password;
}
