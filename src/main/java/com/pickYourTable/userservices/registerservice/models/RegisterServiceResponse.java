package com.pickYourTable.userservices.registerservice.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RegisterServiceResponse {
    private String message;
    private String registerDate;
}
