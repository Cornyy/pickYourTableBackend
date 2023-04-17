package com.pickYourTable.userservices.verificationcodeservice;

import com.pickYourTable.exceptions.ProcessingException;
import com.pickYourTable.repositories.userrepository.User;
import com.pickYourTable.repositories.userrepository.UserRepository;
import com.pickYourTable.userservices.verificationcodeservice.models.VerificationCodeServiceRequest;
import com.pickYourTable.userservices.verificationcodeservice.models.VerificationCodeServiceResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class VerificationCodeServiceImplementation {

    private final UserRepository userRepository;

    public VerificationCodeServiceResponse process(VerificationCodeServiceRequest request) {
        Optional<User> userOptional = userRepository.findByEmail(request.getEmail());
        if (userOptional.isEmpty()) {
            throw new ProcessingException("User with given email does not exists!");
        } else {
            User user = userOptional.get();
            VerificationCodeServiceResponse response;
            if (user.getVerificationCode().equals(request.getCode())) {
                saveActiveUser(user);
                response = VerificationCodeServiceResponse.builder()
                        .message("Verification successful!")
                        .build();
            } else {
                response = VerificationCodeServiceResponse.builder()
                        .message("Verification failed!")
                        .build();
            }
            return response;
        }
    }

    private void saveActiveUser(User user){
        user.setIsActive(true);
        user.setVerificationCode(null);
        userRepository.save(user);
    }
}
