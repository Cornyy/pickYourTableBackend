package com.pickYourTable.restaurantservices.getrestaurantservice.models;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class GetRestaurantsRequest {
    @ApiModelProperty(value = "Miasto", required = true)
    private String city;
}
