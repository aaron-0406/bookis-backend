package com.example.bookisbackend.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.bookisbackend.model.Book;
import com.example.bookisbackend.services.BookService;

public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public ResponseEntity<Book> createAptitud(@Valid @RequestBody Book book) {
        Book aptitudNew = bookService.createBook(book);
        return new ResponseEntity<Book>(aptitudNew, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Book> modificaAptitud(@Valid @RequestBody Book book) {
        Book aptitudUpdate = bookService.updateBook(book);
        return new ResponseEntity<Book>(aptitudUpdate, HttpStatus.OK);
    }

    // http://localhost:8080/aptitudes/1 ==> HTTP DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteAptitud(@PathVariable("id") Integer idBook) {
        bookService.deleteBook(idBook);
        return new ResponseEntity<>("Book deleted", HttpStatus.OK);
    }

    // LISTAR APTITUD
    @GetMapping
    public ResponseEntity<List<Book>> listarAptitud() {
        List<Book> listBook = bookService.listBook();
        return new ResponseEntity<>(listBook, HttpStatus.CREATED);
    }
}
