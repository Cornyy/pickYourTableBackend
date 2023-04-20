package com.pickYourTable.restaurantServices.getrestaurantservice;

import com.pickYourTable.restaurantServices.getrestaurantservice.models.GetRestaurantsRequest;
import com.pickYourTable.restaurantServices.getrestaurantservice.models.GetRestaurantsResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GetRestaurantsServiceController {

    private final GetRestaurantsServiceImplementation getRestaurantsServiceImplementation;

    @GetMapping("/restaurant/getAllRestaurants")
    public GetRestaurantsResponse getAllRestaurants(){
       return getRestaurantsServiceImplementation.process(null);
    }

    @GetMapping("/restaurant/getRestaurantsFromCity")
    public GetRestaurantsResponse getRestaurantsFromCity(@RequestBody GetRestaurantsRequest request){
        return getRestaurantsServiceImplementation.process(request.getCity());
    }
}
