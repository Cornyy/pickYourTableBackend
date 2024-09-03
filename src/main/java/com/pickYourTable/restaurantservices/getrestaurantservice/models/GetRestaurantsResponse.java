package com.pickYourTable.restaurantservices.getrestaurantservice.models;

import com.pickYourTable.repositories.restaurantrepository.Restaurant;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class GetRestaurantsResponse {
    private List<Restaurant> restaurantList;
}
