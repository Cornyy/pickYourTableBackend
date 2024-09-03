package com.pickYourTable.restaurantservices.createrestaurantservice.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RestaurantServiceResponse {
    private String message;
    private String createDate;
}
