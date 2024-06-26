package com.spring.BookReservations.service;

import com.spring.BookReservations.model.Favorite;
import com.spring.BookReservations.repository.FavoriteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FavoriteServiceImpl implements FavoriteService{
    @Autowired
    FavoriteRepository favoriteRepository;
    @Override
    public void save(Favorite favorite) {
        favoriteRepository.save(favorite);
    }

    @Override
    public boolean existsByBookIdAndUserId(int bookId, int userId) {
        return favoriteRepository.existsByBookIdAndUserId(bookId,userId);
    }
}
