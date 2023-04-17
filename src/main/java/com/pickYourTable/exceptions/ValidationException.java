package com.pickYourTable.exceptions;

import java.util.List;

public class ValidationException extends RuntimeException {
    private List<String> errorMessage;
    public ValidationException(List<String> errorMessage) {
        super(String.valueOf(errorMessage));
        this.errorMessage = errorMessage;
    }
}
