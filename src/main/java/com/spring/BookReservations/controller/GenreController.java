package com.spring.BookReservations.controller;

import com.spring.BookReservations.model.Genre;
import com.spring.BookReservations.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class GenreController {
    @Autowired
    GenreService genreService;
    @GetMapping("/genre")
    public String genre(Model model) {
        List<Genre> genreList = genreService.findAll();
        model.addAttribute("genreList", genreList);
        model.addAttribute("genre", new Genre());
        return "genre";
    }

    @PostMapping("/genre")
    public String genreSubmit(@ModelAttribute Genre genre, Model model) {
        genreService.save(genre);
        return "redirect:/genre";
    }
    @GetMapping("/delete/genre/{id}")
    public String deleteGenre(@PathVariable("id") int id, Model model){
        genreService.deleteById(id);
        return "redirect:/genre";
    }
}
