package com.spring.RestaurantReservations.service;

import com.spring.RestaurantReservations.model.Reservation;
import com.spring.RestaurantReservations.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService{
    @Autowired
    ReservationRepository ReservationRepository;
    @Override
    public void save(Reservation Reservation) {
        ReservationRepository.save(Reservation);
    }

    @Override
    @Transactional
    public void deleteByMenuDishId(int id) {
        ReservationRepository.deleteByMenuId(id);
    }

    @Override
    public boolean existsByMenuDishIdAndUserId(int menuId, int userId) {
        return ReservationRepository.existsByMenuIdAndUserId(menuId,userId);
    }

    @Override
    public List<Integer> findAllMenuDishIdsByUserId(int userId) {
        return ReservationRepository.findAllMenuIdsByUserId(userId);
    }
}
