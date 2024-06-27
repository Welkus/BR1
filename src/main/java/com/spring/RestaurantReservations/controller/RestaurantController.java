package com.spring.RestaurantReservations.controller;

import com.spring.RestaurantReservations.model.Restaurant;
import com.spring.RestaurantReservations.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping("/restaurant/search")
    public String searchRestaurants(@RequestParam("query") String query, Model model) {
        List<Restaurant> restaurantList = restaurantService.searchRestaurants(query);
        model.addAttribute("restaurantList", restaurantList);
        return "dashboard";
    }

    @GetMapping("/restaurant/details/{id}")
    public String getRestaurantDetails(@PathVariable Long id, Model model) {
        Optional<Restaurant> restaurant = restaurantService.findById(id);
        if (restaurant.isPresent()) {
            model.addAttribute("restaurant", restaurant.get());
            return "restaurant-details";
        } else {
            return "redirect:/dashboard";
        }
    }

    @GetMapping("/restaurant/create")
    public String createRestaurantForm(Model model) {
        model.addAttribute("restaurant", new Restaurant());
        return "restaurant-form";
    }

    @GetMapping("/restaurant/edit/{id}")
    public String editRestaurantForm(@PathVariable Long id, Model model) {
        Optional<Restaurant> restaurant = restaurantService.findById(id);
        if (restaurant.isPresent()) {
            model.addAttribute("restaurant", restaurant.get());
            return "restaurant-form";
        } else {
            return "redirect:/dashboard";
        }
    }

    @PostMapping("/restaurant/save")
    public String saveRestaurant(@ModelAttribute Restaurant restaurant) {
        restaurantService.save(restaurant);
        return "redirect:/dashboard";
    }
}
