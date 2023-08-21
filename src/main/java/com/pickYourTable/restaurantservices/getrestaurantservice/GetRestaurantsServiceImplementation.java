package com.pickYourTable.restaurantservices.getrestaurantservice;

import com.pickYourTable.repositories.restaurantrepository.Restaurant;
import com.pickYourTable.repositories.restaurantrepository.RestaurantRepository;
import com.pickYourTable.restaurantservices.getrestaurantservice.models.GetRestaurantsResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class GetRestaurantsServiceImplementation {

    private final RestaurantRepository restaurantRepository;

    public GetRestaurantsResponse process(String city) {

        List<Restaurant> list;

        if (city == null) {
          list = (List<Restaurant>) restaurantRepository.findAll();
        } else {
           list = restaurantRepository.findByCity(city);
        }

        return GetRestaurantsResponse.builder()
                .restaurantList(list)
                .build();
    }
}
