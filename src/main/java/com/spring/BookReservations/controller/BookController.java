package com.spring.BookReservations.controller;

import com.spring.BookReservations.model.Book;
import com.spring.BookReservations.model.Genre;
import com.spring.BookReservations.service.BookService;
import com.spring.BookReservations.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    BookService bookService;

    @Autowired
    GenreService genreService;

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        List<Book> bookList = bookService.getAll();
        model.addAttribute("bookList", bookList);
        return "dashboard";
    }

    @GetMapping("/create")
    public String create(Model model) {
        List<String> genres = genreService.findAllGenreNames();
        System.out.println("Genres: " + genres);
        model.addAttribute("genres", genres);
        model.addAttribute("book", new Book());
        return "create";
    }

    @PostMapping("/create")
    public String createSubmit(@ModelAttribute Book book, Model model) {
        bookService.save(book);
        return "redirect:/dashboard";
    }

}
