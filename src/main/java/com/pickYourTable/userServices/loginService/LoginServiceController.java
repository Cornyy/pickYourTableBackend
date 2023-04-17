package com.pickYourTable.userServices.loginService;

import com.pickYourTable.userServices.loginService.models.LoginServiceRequest;
import com.pickYourTable.userServices.loginService.models.LoginServiceResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LoginServiceController {

    private final LoginServiceImplementation loginServiceImplementation;
    private final LoginServiceRequestValidator loginServiceRequestValidator;

    @PostMapping("/user/loginUser")
    public LoginServiceResponse RegisterNewUser(
            @RequestBody LoginServiceRequest request) {
        loginServiceRequestValidator.validateRequest(request);
        return loginServiceImplementation.process(request);
    }

}
