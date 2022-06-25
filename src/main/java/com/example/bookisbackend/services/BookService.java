package com.example.bookisbackend.services;

import java.util.List;

import com.example.bookisbackend.model.Book;

public interface BookService {
    Book createBook(Book book);

    Book updateBook(Book book);

    List<Book> listBook();

    void deleteBook(Integer id);
}
