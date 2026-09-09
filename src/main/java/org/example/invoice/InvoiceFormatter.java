package org.example.invoice;

import org.example.model.Purchase;

public interface InvoiceFormatter {
    String format(Purchase purchase, double total);
}
