package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Lisa Ramel
 * Date: 2021-04-15
 * Time: 10:16
 * Project: Backend1SQL
 * Copywrite: MIT
 */
@Entity
public class Book {

    @Id
    @GeneratedValue
    private Long id;

    private String author;

    private String title;

    public Book(){}

    public Book(Long id, String author, String title) {
        this.id = id;
        this.author = author;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
