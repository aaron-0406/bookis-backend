package com.example.bookisbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idBook;

    @NotNull
    @Column(name = "title", nullable = false, length = 100)
    private String title;

    @NotNull
    @Column(name = "autor", nullable = false, length = 60)
    private String autor;

    @NotNull
    @Column(name = "image", nullable = false, length = 150)
    private String image;

    @NotNull
    @Column(name = "type", nullable = false, length = 50)
    private String type;

    @NotNull
    @Column(name = "editorial", nullable = false, length = 80)
    private String editorial;

    @NotNull
    @Column(name = "price", nullable = false, length = 30)
    private String price;

    @NotNull
    @Column(name = "synopsis", nullable = false, length = 30)
    private String synopsis;

    public Book() {
    }

    public Book(Integer idBook, String title, String autor, String image,
            String type, String editorial, String price, String synopsis) {
        this.idBook = idBook;
        this.title = title;
        this.autor = autor;
        this.image = image;
        this.type = type;
        this.editorial = editorial;
        this.price = price;
        this.synopsis = synopsis;
    }

    public Integer getIdBook() {
        return this.idBook;
    }

    public void setIdBook(Integer idBook) {
        this.idBook = idBook;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEditorial() {
        return this.editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSynopsis() {
        return this.synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
}
