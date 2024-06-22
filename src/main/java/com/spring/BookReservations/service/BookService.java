package com.spring.BookReservations.service;

import com.spring.BookReservations.model.Book;

import java.util.List;

public interface BookService {
    void save(Book book);
    List<Book> getAll();
}
