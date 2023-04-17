package com.pickYourTable.userservices.verificationcodeservice;

import com.pickYourTable.userservices.verificationcodeservice.models.VerificationCodeServiceRequest;
import com.pickYourTable.userservices.verificationcodeservice.models.VerificationCodeServiceResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class VerificationCodeServiceController {

    private final VerificationCodeServiceImplementation verificationCodeServiceImplementation;

    @PostMapping("user/verifyCode")
    public VerificationCodeServiceResponse verifyCode(
            @RequestBody VerificationCodeServiceRequest request) {
        VerificationCodeServiceRequestValidator.validateRequest(request);
        return verificationCodeServiceImplementation.process(request);
    }
}
