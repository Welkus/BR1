package com.spring.BookReservations.service;

import com.spring.BookReservations.model.Genre;
import com.spring.BookReservations.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreServiceImpl implements GenreService {

    @Autowired
    private GenreRepository genreRepository;

    @Override
    public void save(Genre genre) {
        genreRepository.save(genre);
    }
    @Override
    public List<String> findAllGenreNames() {
        return genreRepository.findAllGenreNames();
    }
}
