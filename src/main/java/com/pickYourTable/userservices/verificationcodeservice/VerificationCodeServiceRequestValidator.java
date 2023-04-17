package com.pickYourTable.userservices.verificationcodeservice;

import com.pickYourTable.exceptions.ValidationException;
import com.pickYourTable.userservices.verificationcodeservice.models.VerificationCodeServiceRequest;

import java.util.ArrayList;
import java.util.List;

public class VerificationCodeServiceRequestValidator {

    public static void validateRequest(VerificationCodeServiceRequest request){

        List<String> errorMessages = new ArrayList<>();
        if(request.getEmail() == null){
            errorMessages.add("Email field cannot be empty!");
        }
        if(request.getCode() == null){
            errorMessages.add("Code field cannot be empty!");
        }

        if(!errorMessages.isEmpty()){
            throw new ValidationException(errorMessages);
        }
    }
}
