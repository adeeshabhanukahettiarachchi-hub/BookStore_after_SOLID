package org.example.invoice;


public class TextInvoiceFormatter implements InvoiceFormatter {
    public String format(Purchase purchase,double total){
        StringBuilder invoice=new StringBuilder("===== BOOKSTORE INVOICE =====\n");
        invoice.append("Customer: ").append(purchase.getCustomer().getName()).append("\n");
        for(Book book:purchase.getBooks())
            invoice.append(book.getTitle()).append(" - Rs. ").append(String.format("%.2f",book.getPrice())).append("\n");
        invoice.append("Total: Rs. ").append(String.format("%.2f",total)).append("\n");
        return invoice.toString();
    }
}
