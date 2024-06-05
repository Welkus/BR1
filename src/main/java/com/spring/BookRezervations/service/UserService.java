package com.spring.BookRezervations.service;

import com.spring.BookRezervations.model.User;

public interface UserService {
    void save(User user);
    User findByUsername(String username);
}
