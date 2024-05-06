package com.pickYourTable.reservationservices.createreservation;

import com.pickYourTable.reservationservices.createreservation.models.CreateReservationServiceRequest;
import com.pickYourTable.reservationservices.createreservation.models.CreateReservationServiceResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CreateReservationServiceController {

    @Autowired
    private CreateReservationServiceImplmentation createReservationServiceImplmentation;

    @PostMapping("/reservation/createNewReservation")
    public CreateReservationServiceResponse createNewRestaurant(@RequestBody CreateReservationServiceRequest request) {
        return createReservationServiceImplmentation.createReservationServiceProcess(request);
    }
}
