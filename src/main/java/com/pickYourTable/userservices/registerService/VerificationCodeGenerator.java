package com.pickYourTable.userservices.registerService;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class VerificationCodeGenerator {
    public String generateCode(){
        Random r = new Random( System.currentTimeMillis() );
        return String.valueOf((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
    }
}
