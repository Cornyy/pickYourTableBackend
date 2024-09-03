package com.pickYourTable.userservices.loginservice;

import com.pickYourTable.exceptions.ProcessingException;
import com.pickYourTable.repositories.userrepository.User;
import com.pickYourTable.repositories.userrepository.UserRepository;
import com.pickYourTable.userservices.loginservice.models.LoginServiceRequest;
import com.pickYourTable.userservices.loginservice.models.LoginServiceResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LoginServiceImplementation {

    private final UserRepository userRepository;

    public LoginServiceResponse process(LoginServiceRequest request) {
        Optional<User> userOptional = userRepository.findByLogin(request.getLogin());

        if (userOptional.isEmpty()) {
            throw new ProcessingException("User with given login not exists!!");
        } else {
            User user = userOptional.get();
            if (user.getPassword().equals(request.getPassword())) {
                if(user.getIsActive()){
                    return LoginServiceResponse.builder()
                            .loginDate(LocalDate.now().toString())
                            .message("Signed in successfully!")
                            .build();
                }else{
                    throw new ProcessingException("Account is not active!");
                }
            } else {
                throw new ProcessingException("Wrong password!");
            }
        }
        //todo DODAĆ EXCEPTION DO POWYŻSZYCH - ŻEBY NIE RZUCAĆ KODU 500.
        //todo ZACZĄĆ OD SEKCJI RESERVATIONSERVICES
    }
}
