package com.spring.RestaurantReservations.controller;

import com.spring.RestaurantReservations.model.Reservation;
import com.spring.RestaurantReservations.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class ReservationController {
    @Autowired
    ReservationService reservationService;

    @GetMapping("/menuDish/Reservation/{menuDishId}/{userId}")
    public String ReservationmenuDish(@PathVariable("menuDishId") int menuDishId, @PathVariable("userId") int userId){
        if (!reservationService.existsByMenuDishIdAndUserId(menuDishId, userId)) {
            reservationService.save(new Reservation(menuDishId, userId));
        }
        return "redirect:/dashboard";
    }
    @GetMapping("/account/unlike/{id}")
    public String removeReservation(@PathVariable("id") int id){
        reservationService.deleteByMenuDishId(id);
        return "redirect:/account";
    }
}
