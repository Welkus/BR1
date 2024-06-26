package com.spring.BookReservations.service;

import com.spring.BookReservations.model.Favorite;

public interface FavoriteService {
    void save(Favorite favorite);
    boolean existsByBookIdAndUserId(int bookId, int userId);
}
