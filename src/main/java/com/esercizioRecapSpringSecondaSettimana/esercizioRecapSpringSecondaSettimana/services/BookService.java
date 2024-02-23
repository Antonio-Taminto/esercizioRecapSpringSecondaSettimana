package com.esercizioRecapSpringSecondaSettimana.esercizioRecapSpringSecondaSettimana.services;

import com.esercizioRecapSpringSecondaSettimana.esercizioRecapSpringSecondaSettimana.entities.Book;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;

@Service
public class BookService {

    private ArrayList<Book> bookArrayList = new ArrayList<>();
    public ArrayList<Book> getBooks(){
        return bookArrayList;
    }

    public Book createBook(Book book){
        bookArrayList.add(book);
        return book;
    }
}
