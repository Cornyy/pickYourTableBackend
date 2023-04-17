package com.pickYourTable.userServices.registerService;

import com.pickYourTable.userServices.registerService.models.RegisterServiceRequest;
import com.pickYourTable.userServices.registerService.models.RegisterServiceResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RegisterServiceController {

    private final RegisterServiceImplementation registerServiceImplementation;

    @PostMapping("/user/registerNewUser")
    public RegisterServiceResponse RegisterNewUser(
            @RequestBody RegisterServiceRequest request) {
        RegisterServiceRequestValidator.validateRequest(request);
        return registerServiceImplementation.process(request);
    }
}
