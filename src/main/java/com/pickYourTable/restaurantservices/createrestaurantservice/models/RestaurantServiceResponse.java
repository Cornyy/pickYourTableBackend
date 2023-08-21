package com.pickYourTable.restaurantservices.createrestaurantservice.models;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RestaurantServiceResponse {

    @ApiModelProperty("Treść odpowiedzi")
    private String message;

    @ApiModelProperty("Data utworzenia")
    private String createDate;
}
