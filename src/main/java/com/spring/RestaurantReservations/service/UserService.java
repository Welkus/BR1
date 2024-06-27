package com.spring.RestaurantReservations.service;

import com.spring.RestaurantReservations.model.User;

public interface UserService {
    void save(User user);
    User findByUsername(String username);
}
