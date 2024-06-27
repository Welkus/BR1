package com.spring.RestaurantReservations.service;

import com.spring.RestaurantReservations.model.MenuDish;
import com.spring.RestaurantReservations.repository.MenuDishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MenuDishServiceImpl implements MenuDishService {
    @Autowired
    MenuDishRepository menuDishRepository;

    @Override
    public void save(MenuDish menuDish) {
        menuDishRepository.save(menuDish);
    }

    @Override
    public List<MenuDish> getAll() {
        return menuDishRepository.findAll();
    }

    @Override
    public List<MenuDish> findAll() {
        return menuDishRepository.findAll();
    }

    @Override
    public void deleteById(int id) {
        menuDishRepository.deleteById(id);
    }

    @Override
    public Optional<MenuDish> findById(int id) {
        return menuDishRepository.findById(id);
    }

    @Override
    public List<MenuDish> findMenuDishesByTitle(String query) {
        return menuDishRepository.findByNameContainingIgnoreCase(query);
    }

    @Override
    public List<MenuDish> findByIdIn(List<Integer> ids) {
        return menuDishRepository.findByIdIn(ids);
    }
}
