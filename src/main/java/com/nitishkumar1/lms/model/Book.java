package com.nitishkumar1.lms.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",nullable = false, updatable = false)
    private Long id;
    @Column(name = "isbn")
    private String isbn;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "author")
    private String author;
    @Column(name = "category")
    private String category;
    @Column(name = "publisher")
    private String publisher;
    @Column(name = "photo")
    private String photo;

    public Book() {
    }

    public Book(String isbn, String name, String description, String author, String category, String publisher, String photo) {
        this.isbn = isbn;
        this.name = name;
        this.description = description;
        this.author = author;
        this.category = category;
        this.publisher = publisher;
        this.photo = photo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", publisher='" + publisher + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }
}
