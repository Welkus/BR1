package com.spring.BookReservations.service;

import com.spring.BookReservations.model.Book;
import com.spring.BookReservations.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{
    @Autowired
    private BookRepository bookRepository;
    @Override
    public void save(Book book) {
        bookRepository.save(book);
    }

    @Override
    public List<Book> getAll(){
        return bookRepository.findAll();
    }
}
