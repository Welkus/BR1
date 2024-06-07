package com.spring.BookReservations.repository;

import com.spring.BookReservations.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}