package org.example.repository;

import org.example.model.Book;

import java.util.ArrayList;
import java.util.List; import java.util.Optional;
public class InMemoryBookRepository implements BookRepository {
    private final List<Book> books=new ArrayList<>();
    public void add(Book book){books.add(book);}
    public Optional<Book> findById(int id){return books.stream().filter(b->b.getId()==id).findFirst();}
    public List<Book> findAll(){return List.copyOf(books);}
}
