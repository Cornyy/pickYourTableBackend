package com.pickYourTable.reservationservices.createreservation.models;

import com.pickYourTable.repositories.restaurantrepository.Restaurant;
import com.pickYourTable.repositories.userrepository.User;
import lombok.Data;

import java.time.LocalDate;

@Data
public class CreateReservationServiceRequest {

    private LocalDate reservationDate;
    private User userId;
    private Restaurant restaurantId;
}
