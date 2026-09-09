package org.example;

import org.example.invoice.FileInvoiceWriter;
import org.example.invoice.TextInvoiceFormatter;
import org.example.model.Book;
import org.example.model.Customer;
import org.example.model.Purchase;
import org.example.repository.BookRepository;
import org.example.repository.InMemoryBookRepository;
import org.example.service.BillingService;
import org.example.service.BookstoreService;
import org.example.service.InvoiceService;

public class Main {
    public static void main(String[] args){
        BookRepository repository=new InMemoryBookRepository();
        BookstoreService bookstore=new BookstoreService(repository);
        bookstore.addBook(new Book(1,"Clean Code","Robert C. Martin",4500));
        bookstore.addBook(new Book(2,"Effective Java","Joshua Bloch",5200));
        bookstore.addBook(new Book(3,"Head First Java","Kathy Sierra",3900));
        bookstore.displayBooks();
        Customer customer=new Customer(101,"Adeesha Bhanuka","adeesha@example.com");
        Purchase purchase=bookstore.createPurchase(1001,customer,1,3);
        InvoiceService invoiceService=new InvoiceService(new BillingService(),
                new TextInvoiceFormatter(),new FileInvoiceWriter("invoice.txt"));
        System.out.println("\n"+invoiceService.generate(purchase));
    }
}