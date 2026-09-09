package org.example.service;

import org.example.model.Book;
import org.example.model.Customer;
import org.example.model.Purchase;
import org.example.repository.BookRepository;

public class BookstoreService {
    private final BookRepository bookRepository;
    public BookstoreService(BookRepository bookRepository){this.bookRepository=bookRepository;}
    public void addBook(Book book){bookRepository.add(book);}
    public void displayBooks(){
        System.out.println("\n--- Available Books ---");
        bookRepository.findAll().forEach(book->System.out.printf("%d | %s | %s | Rs. %.2f%n",
                book.getId(),book.getTitle(),book.getAuthor(),book.getPrice()));
    }
    public Purchase createPurchase(int purchaseId, Customer customer, int... bookIds){
        Purchase purchase=new Purchase(purchaseId,customer);
        for(int id:bookIds) bookRepository.findById(id).ifPresent(purchase::addBook);
        return purchase;
    }
}