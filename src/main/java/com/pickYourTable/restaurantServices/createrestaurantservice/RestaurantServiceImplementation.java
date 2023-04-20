package com.pickYourTable.restaurantServices.createrestaurantservice;

import com.pickYourTable.exceptions.ProcessingException;
import com.pickYourTable.repositories.restaurantrepository.Restaurant;
import com.pickYourTable.repositories.restaurantrepository.RestaurantRepository;
import com.pickYourTable.restaurantServices.createrestaurantservice.models.RestaurantServiceRequest;
import com.pickYourTable.restaurantServices.createrestaurantservice.models.RestaurantServiceResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RestaurantServiceImplementation {

    private final RestaurantRepository restaurantRepository;

    public RestaurantServiceResponse createRestaurantProcess(RestaurantServiceRequest request) {

        Optional<Restaurant> nameRestaurant = restaurantRepository.findByName(request.getName());
        Optional<Restaurant> emailRestaurant = restaurantRepository.findByEmail(request.getEmail());

        if(nameRestaurant.isPresent()){
            throw new ProcessingException("Restaurant with given name already exists!");
        }

        if(emailRestaurant.isPresent()){
            throw new ProcessingException("Restaurant with given email already exists!");
        }

        Restaurant restaurant = Restaurant.builder()
                .city(request.getCity())
                .description(request.getDescription())
                .name(request.getName())
                .localNumber(request.getLocalNumber())
                .phoneNumber(request.getPhoneNumber())
                .postalCode(request.getPostalCode())
                .cousineType(request.getCousineType())
                .street(request.getStreet())
                .email(request.getEmail())
                .build();

        restaurantRepository.save(restaurant);

        return RestaurantServiceResponse.builder()
                .message("Restauracja utworzona pomyślnie!")
                .createDate(LocalDate.now().toString())
                .build();
    }

    public RestaurantServiceResponse updateRestaurantProcess(RestaurantServiceRequest request) {

        Optional<Restaurant> restaurantOptional = restaurantRepository.findByName(request.getName());

        if(restaurantOptional.isEmpty()){
            throw new ProcessingException("Restaurant with given name not exists!");
        }

        Restaurant restaurant = restaurantOptional.get();

        restaurant.setCity(request.getCity());
        restaurant.setDescription(request.getDescription());
        restaurant.setName(request.getName());
        restaurant.setLocalNumber(request.getLocalNumber());
        restaurant.setPhoneNumber(request.getPhoneNumber());
        restaurant.setPostalCode(request.getPostalCode());
        restaurant.setCousineType(request.getCousineType());
        restaurant.setStreet(request.getStreet());
        restaurant.setEmail(request.getEmail());

        restaurantRepository.save(restaurant);

        return RestaurantServiceResponse.builder()
                .message("Dane restauracji zaktualiowane pomyślnie!")
                .createDate(LocalDate.now().toString())
                .build();
    }
}
