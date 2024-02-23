package com.esercizioRecapSpringSecondaSettimana.esercizioRecapSpringSecondaSettimana.controllers;

import com.esercizioRecapSpringSecondaSettimana.esercizioRecapSpringSecondaSettimana.entities.Book;
import com.esercizioRecapSpringSecondaSettimana.esercizioRecapSpringSecondaSettimana.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/v1")
public class BooksController {
    @Autowired
    private BookService bookService;
    @GetMapping("/getbooks")
    public ArrayList<Book> getBooks(){
        return bookService.getBooks();
    }

    @PostMapping("/createBook")
    public Book createBook(@RequestBody Book book){
        bookService.createBook(book);
        return book;
    }
}
