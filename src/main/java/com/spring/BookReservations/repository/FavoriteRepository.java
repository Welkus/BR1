package com.spring.BookReservations.repository;

import com.spring.BookReservations.model.Favorite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteRepository extends JpaRepository<Favorite, Integer> {
    boolean existsByBookIdAndUserId(int bookId, int userId);
}
