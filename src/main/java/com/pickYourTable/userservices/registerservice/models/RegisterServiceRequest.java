package com.pickYourTable.userservices.registerservice.models;
import lombok.Data;

import java.time.LocalDate;

@Data
public class RegisterServiceRequest {
    private String email;
    private String login;
    private String password;
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private String city;

}
