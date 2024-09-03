package com.pickYourTable.restaurantservices.createrestaurantservice.models;

import com.pickYourTable.repositories.restaurantrepository.CousineTypeEnum;
import lombok.Data;

@Data
public class RestaurantServiceRequest {

    private String name;
    private String city;
    private String postalCode;
    private String street;
    private String localNumber;
    private String description;
    private String phoneNumber;
    private String email;
    private CousineTypeEnum cousineType;
}
