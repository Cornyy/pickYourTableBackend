package com.pickYourTable.userServices.loginService;

import com.pickYourTable.exceptions.ProcessingException;
import com.pickYourTable.repositories.userRepository.User;
import com.pickYourTable.repositories.userRepository.UserRepository;
import com.pickYourTable.userServices.loginService.models.LoginServiceRequest;
import com.pickYourTable.userServices.loginService.models.LoginServiceResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LoginServiceImplementation {

    private final UserRepository userRepository;

    public LoginServiceResponse process(LoginServiceRequest request) {
        Optional<User> user = userRepository.findByLogin(request.getLogin());

        if (user.isEmpty()) {
            throw new ProcessingException("User with given login not exists!");
        } else {
            if (user.get().getPassword().equals(request.getPassword())) {
                return LoginServiceResponse.builder()
                        .loginDate(LocalDate.now().toString())
                        .message("Signed in successfully!")
                        .build();
            } else {
                throw new ProcessingException("Wrong password!");
            }
        }
    }
}
