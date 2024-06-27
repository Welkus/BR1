package com.spring.RestaurantReservations.service;

import com.spring.RestaurantReservations.model.Menu;
import com.spring.RestaurantReservations.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuRepository menuRepository;

    @Override
    public Optional<Menu> findById(Long id) {
        return menuRepository.findById(id);
    }

    @Override
    public void save(Menu menu) {
        menuRepository.save(menu);
    }

    @Override
    public List<Menu> findAll() {
        return menuRepository.findAll();
    }
}
