package com.spring.RestaurantReservations.controller;

import com.spring.RestaurantReservations.model.Menu;
import com.spring.RestaurantReservations.model.MenuDish;
import com.spring.RestaurantReservations.model.Restaurant;
import com.spring.RestaurantReservations.service.MenuService;
import com.spring.RestaurantReservations.service.RestaurantService;
import com.spring.RestaurantReservations.service.MenuDishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class MenuController {

    @Autowired
    private MenuService menuService;

    @Autowired
    private RestaurantService restaurantService;

    @Autowired
    private MenuDishService menuDishService;

    @GetMapping("/menu/create")
    public String createMenuForm(Model model) {
        model.addAttribute("menu", new Menu());
        List<Restaurant> restaurants = restaurantService.findAll();
        List<MenuDish> dishes = menuDishService.findAll();
        model.addAttribute("restaurants", restaurants);
        model.addAttribute("dishes", dishes);
        return "menu-form";
    }

    @GetMapping("/menu/edit/{id}")
    public String editMenuForm(@PathVariable Long id, Model model) {
        Optional<Menu> menu = menuService.findById(id);
        if (menu.isPresent()) {
            model.addAttribute("menu", menu.get());
            List<Restaurant> restaurants = restaurantService.findAll();
            List<MenuDish> dishes = menuDishService.findAll();
            model.addAttribute("restaurants", restaurants);
            model.addAttribute("dishes", dishes);
            return "menu-form";
        } else {
            return "redirect:/dashboard";
        }
    }

    @PostMapping("/menu/save")
    public String saveMenu(@ModelAttribute Menu menu) {
        menuService.save(menu);
        return "redirect:/dashboard";
    }
}
