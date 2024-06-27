package com.spring.RestaurantReservations.service;

import com.spring.RestaurantReservations.model.Reservation;

import java.util.List;

public interface ReservationService {
    void save(Reservation Reservation);
    void deleteByMenuDishId(int id);
    boolean existsByMenuDishIdAndUserId(int menuId, int userId);
    List<Integer> findAllMenuDishIdsByUserId(int userId);
}
