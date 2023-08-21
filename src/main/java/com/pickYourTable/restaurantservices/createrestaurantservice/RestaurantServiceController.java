package com.pickYourTable.restaurantservices.createrestaurantservice;

import com.pickYourTable.restaurantservices.createrestaurantservice.models.RestaurantServiceRequest;
import com.pickYourTable.restaurantservices.createrestaurantservice.models.RestaurantServiceResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RestaurantServiceController {

    private final RestaurantServiceImplementation restaurantServiceImplementation;

    @PostMapping("/restaurant/createNewRestaurant")
    public RestaurantServiceResponse createNewRestaurant(@RequestBody RestaurantServiceRequest request){
        return restaurantServiceImplementation.createRestaurantProcess(request);
    }

    @PostMapping("/restaurant/updateRestaurant")
    public RestaurantServiceResponse updateRestaurant(@RequestBody RestaurantServiceRequest request){
        return restaurantServiceImplementation.updateRestaurantProcess(request);
    }
}
