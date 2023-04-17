package com.pickYourTable.userservices.registerService;

import com.pickYourTable.exceptions.ValidationException;
import com.pickYourTable.userservices.registerService.models.RegisterServiceRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RegisterServiceRequestValidator {

    public static void validateRequest(RegisterServiceRequest request){
        List<String> errorMessages = new ArrayList<>();
        if(request.getEmail() == null){
            errorMessages.add("Email field cannot be empty!");
        }
        if(request.getLogin() == null){
            errorMessages.add("Login field cannot be empty!");
        }
        if(request.getName() == null){
            errorMessages.add("Name field cannot be empty!");
        }
        if(request.getSurname() == null){
            errorMessages.add("Surname field cannot be empty!");
        }
        if(request.getCity() == null) {
            errorMessages.add("City field cannot be empty!");
        }
        if(request.getPassword() == null){
            errorMessages.add("Password field cannot be empty!");
        }

        if(!errorMessages.isEmpty()){
            throw new ValidationException(errorMessages);
        }

    }
}
