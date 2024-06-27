package com.spring.RestaurantReservations.service;

import com.spring.RestaurantReservations.model.MenuDish;

import java.util.List;
import java.util.Optional;

public interface MenuDishService {
    void save(MenuDish menuDish);
    List<MenuDish> getAll();
    List<MenuDish> findAll();
    void deleteById(int id);
    Optional<MenuDish> findById(int id);
    List<MenuDish> findMenuDishesByTitle(String query);
    List<MenuDish> findByIdIn(List<Integer> ids);
}
