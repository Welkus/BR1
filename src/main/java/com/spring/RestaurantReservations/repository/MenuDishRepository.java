package com.spring.RestaurantReservations.repository;

import com.spring.RestaurantReservations.model.MenuDish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuDishRepository extends JpaRepository<MenuDish, Integer> {
    List<MenuDish> findByNameContainingIgnoreCase(String query);
    List<MenuDish> findByIdIn(List<Integer> ids);
}
