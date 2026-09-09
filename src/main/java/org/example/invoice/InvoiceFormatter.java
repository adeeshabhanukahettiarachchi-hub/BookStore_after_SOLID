package org.example.invoice;

public interface InvoiceFormatter {
    String format(Purchase purchase,double total);
}
