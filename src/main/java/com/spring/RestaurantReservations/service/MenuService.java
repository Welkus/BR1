package com.spring.RestaurantReservations.service;

import com.spring.RestaurantReservations.model.Menu;

import java.util.List;
import java.util.Optional;

public interface MenuService {
    Optional<Menu> findById(Long id);
    void save(Menu menu);
    List<Menu> findAll();
}
