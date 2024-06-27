package com.spring.RestaurantReservations.service;

import com.spring.RestaurantReservations.model.Restaurant;

import java.util.List;
import java.util.Optional;

public interface RestaurantService {
    List<Restaurant> searchRestaurants(String query);
    Optional<Restaurant> findById(Long id);
    void save(Restaurant restaurant);

    List<Restaurant> findAll();
}
