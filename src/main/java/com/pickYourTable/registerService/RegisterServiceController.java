package com.pickYourTable.registerService;

import com.pickYourTable.registerService.models.RegisterServiceRequest;
import com.pickYourTable.registerService.models.RegisterServiceResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterServiceController {

    @PostMapping
    public RegisterServiceResponse register(@RequestBody RegisterServiceRequest request){

        return null;
    }
}
