package com.pickYourTable.userservices.registerService;

import com.pickYourTable.emailsender.EmailSenderService;
import com.pickYourTable.userservices.registerService.models.RegisterServiceRequest;
import com.pickYourTable.userservices.registerService.models.RegisterServiceResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RegisterServiceController {

    private final RegisterServiceImplementation registerServiceImplementation;
    private final EmailSenderService emailSenderService;

    @PostMapping("/user/registerNewUser")
    public RegisterServiceResponse RegisterNewUser(
            @RequestBody RegisterServiceRequest request) {
        RegisterServiceRequestValidator.validateRequest(request);
        return registerServiceImplementation.process(request);
    }
}
