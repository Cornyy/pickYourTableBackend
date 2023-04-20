package com.pickYourTable.repositories.restaurantrepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {
    Optional<Restaurant> findByName(String name);

    Optional<Restaurant> findByEmail(String email);

    List<Restaurant> findByCity(String city);

}
