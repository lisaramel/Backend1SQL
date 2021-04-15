package com.example.demo.repositories;

import com.example.demo.models.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Lisa Ramel
 * Date: 2021-04-15
 * Time: 10:31
 * Project: Backend1SQL
 * Copywrite: MIT
 */
public interface BookRepository extends CrudRepository<Book, Long> {


}
