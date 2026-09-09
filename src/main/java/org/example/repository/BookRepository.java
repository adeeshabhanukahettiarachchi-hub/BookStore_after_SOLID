package org.example.repository;

import org.example.model.Book;
import java.util.List;
import java.util.Optional;

public interface BookRepository {
    void add(Book book); Optional<Book> findById(int id); List<Book> findAll();

}
