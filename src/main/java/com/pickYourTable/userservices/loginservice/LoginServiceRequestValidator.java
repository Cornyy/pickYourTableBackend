package com.pickYourTable.userservices.loginservice;

import com.pickYourTable.exceptions.ValidationException;
import com.pickYourTable.userservices.loginservice.models.LoginServiceRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoginServiceRequestValidator {
    public void validateRequest(LoginServiceRequest request) {
        List<String> errorMessages = new ArrayList<>();
        if (request.getLogin() == null) {
            errorMessages.add("Login field cannot be empty!");
        }

        if (request.getPassword() == null) {
            errorMessages.add("Password field cannot be empty!");
        }

        if (!errorMessages.isEmpty()) {
            throw new ValidationException(errorMessages);
        }
    }
}
