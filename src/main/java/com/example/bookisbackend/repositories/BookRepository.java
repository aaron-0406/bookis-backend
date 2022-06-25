package com.example.bookisbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookisbackend.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
