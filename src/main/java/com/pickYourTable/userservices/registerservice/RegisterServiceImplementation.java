package com.pickYourTable.userservices.registerservice;

import com.pickYourTable.emailsender.EmailSenderService;
import com.pickYourTable.exceptions.ProcessingException;
import com.pickYourTable.repositories.userrepository.User;
import com.pickYourTable.repositories.userrepository.UserRepository;
import com.pickYourTable.userservices.registerservice.models.RegisterServiceRequest;
import com.pickYourTable.userservices.registerservice.models.RegisterServiceResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RegisterServiceImplementation {

    private final UserRepository userRepository;
    private final VerificationCodeGenerator verificationCodeGenerator;
    private final EmailSenderService emailSender;

    public RegisterServiceResponse process(RegisterServiceRequest request) {
        LocalDate actualDate = LocalDate.now();
        Optional<User> userLogin = userRepository.findByLogin(request.getLogin());
        Optional<User> userEmail = userRepository.findByEmail(request.getEmail());
        if (userLogin.isPresent()) {
            throw new ProcessingException("User with given login already exists!");
        } else if (userEmail.isPresent()) {
            throw new ProcessingException("User with given email already exists!");
        } else {
            String verificationCode = verificationCodeGenerator.generateCode();

            userRepository.save(User.builder()
                    .email(request.getEmail())
                    .login(request.getLogin())
                    .password(request.getPassword())
                    .city(request.getCity())
                    .name(request.getName())
                    .surname(request.getSurname())
                    .dateOfBirth(request.getDateOfBirth())
                    .registerDate(actualDate)
                    .lastLoginDate(actualDate)
                    .isActive(false)
                    .verificationCode(verificationCode)
                    .build());

            //emailSender.sendEmailVerificationCode(verificationCode, request.getEmail());

            return RegisterServiceResponse.builder()
                    .registerDate(actualDate.toString())
                    .message("Registration successful!")
                    .build();
        }
    }
}
