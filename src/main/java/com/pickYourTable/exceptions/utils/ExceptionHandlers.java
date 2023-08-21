package com.pickYourTable.exceptions.utils;

import com.pickYourTable.exceptions.ProcessingException;
import com.pickYourTable.exceptions.ValidationException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@ControllerAdvice
public class ExceptionHandlers extends ResponseEntityExceptionHandler {

    @ExceptionHandler({ValidationException.class})
    public ResponseEntity<Object> handleValidationException(
            Exception ex, WebRequest request) {
        return new ResponseEntity(
                new ExceptionMessage("VALIDATION_ERROR", Timestamp.valueOf(LocalDateTime.now()), ex.getMessage(), "400"), new HttpHeaders(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler({ProcessingException.class})
    public ResponseEntity<Object> handleProcessingException(
            Exception ex, WebRequest request) {
        return new ResponseEntity(
                new ExceptionMessage("PROCESSING_ERROR", Timestamp.valueOf(LocalDateTime.now()), ex.getMessage(), "500"), new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}