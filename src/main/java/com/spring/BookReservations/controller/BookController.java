package com.spring.BookReservations.controller;

import com.spring.BookReservations.model.Book;
import com.spring.BookReservations.service.BookService;
import com.spring.BookReservations.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

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
        model.addAttribute("genres", genres);
        model.addAttribute("book", new Book());
        return "create";
    }

    @PostMapping("/create")
    public String createSubmit(@ModelAttribute Book book, Model model) {
        bookService.save(book);
        return "redirect:/dashboard";
    }
    @GetMapping("/book/edit/{id}")
    public String editBook(@PathVariable("id") int id, Model model) {
        Optional<Book> book = bookService.findById(id);
        List<String> genres = genreService.findAllGenreNames();
        model.addAttribute("genres", genres);
        model.addAttribute("book", book);
        return "edit-book";
    }
    @PostMapping("/book/edit")
    public String editBookSubmit(@ModelAttribute Book book) {
        bookService.save(book);
        return "redirect:/dashboard";
    }

}
