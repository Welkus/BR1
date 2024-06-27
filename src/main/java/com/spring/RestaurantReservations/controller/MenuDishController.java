package com.spring.RestaurantReservations.controller;

import com.spring.RestaurantReservations.model.MenuDish;
import com.spring.RestaurantReservations.service.MenuDishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MenuDishController {

    @Autowired
    private MenuDishService menuDishService;

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        List<MenuDish> menuDishList = menuDishService.getAll();
        model.addAttribute("menuDishList", menuDishList);
        return "dashboard";
    }

    @GetMapping("/dish/create")
    public String createForm(Model model) {
        model.addAttribute("menuDish", new MenuDish());
        return "createDish";
    }

    @PostMapping("/dish/create")
    public String createSubmit(@ModelAttribute MenuDish menuDish, Model model) {
        menuDishService.save(menuDish);
        return "redirect:/dashboard";
    }

    @PostMapping("/menuDish/edit")
    public String editMenuDishSubmit(@ModelAttribute MenuDish menuDish) {
        menuDishService.save(menuDish);
        return "redirect:/dashboard";
    }

    @GetMapping("/menuDish/delete/{id}")
    public String deleteMenuDish(@PathVariable("id") int id) {
        menuDishService.deleteById(id);
        return "redirect:/dashboard";
    }

    @GetMapping("/dashboard/search")
    public String searchMenuDishes(@RequestParam("query") String query, Model model) {
        List<MenuDish> filteredMenuDishes = menuDishService.findMenuDishesByTitle(query);
        model.addAttribute("menuDishList", filteredMenuDishes);
        return "dashboard";
    }
}
