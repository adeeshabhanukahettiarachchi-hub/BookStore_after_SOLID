package org.example.service;

import org.example.invoice.InvoiceFormatter;
import org.example.invoice.InvoiceWriter;
import org.example.model.Purchase;

public class InvoiceService {
    private final BillingService billingService; private final InvoiceFormatter formatter; private final InvoiceWriter writer;
    public InvoiceService(BillingService billingService, InvoiceFormatter formatter, InvoiceWriter writer){
        this.billingService=billingService; this.formatter=formatter; this.writer=writer;
    }
    public String generate(Purchase purchase){
        double total=billingService.calculateTotal(purchase);
        String invoice=formatter.format(purchase,total); writer.write(invoice); return invoice;
    }
}
