package com.pickYourTable.restaurantservices.getrestaurantservice.models;

import com.pickYourTable.repositories.restaurantrepository.Restaurant;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class GetRestaurantsResponse {
    @ApiModelProperty(value = "Lista restauracji")
    private List<Restaurant> restaurantList;
}
