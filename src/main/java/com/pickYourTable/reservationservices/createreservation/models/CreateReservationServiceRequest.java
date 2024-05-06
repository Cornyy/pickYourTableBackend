package com.pickYourTable.reservationservices.createreservation.models;

import com.pickYourTable.repositories.restaurantrepository.Restaurant;
import com.pickYourTable.repositories.userrepository.User;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDate;

@Data
public class CreateReservationServiceRequest {
    @ApiModelProperty(value = "Data rezerwacji", required = true)
    private LocalDate reservationDate;

    @ApiModelProperty(value = "Id użytkownika", required = true)
    private User userId;

    @ApiModelProperty(value = "Id restauracji", required = true)
    private Restaurant restaurantId;
}
