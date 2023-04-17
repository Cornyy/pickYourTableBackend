package com.pickYourTable.exceptions.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Timestamp;


@Data
@AllArgsConstructor
public class ExceptionMessage {

    private String errorCode;
    private Timestamp timestamp;
    private String message;
    private String httpStatus;
}
