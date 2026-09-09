package org.example.service;

import org.example.model.Book;
import org.example.model.Purchase;

public class BillingService {

    public double calculateTotal(Purchase purchase){
        return purchase.getBooks().stream().mapToDouble(Book::getPrice).sum();
    }
}
