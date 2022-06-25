package com.example.bookisbackend.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bookisbackend.model.Book;
import com.example.bookisbackend.repositories.BookRepository;
import com.example.bookisbackend.services.BookService;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> listBook() {
        return bookRepository.findAll();
    }

    @Override
    public void deleteBook(Integer id) {
        bookRepository.deleteById(id);
    }

}
