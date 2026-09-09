package org.example.model;

public class Purchase {
    private final int id; private final Customer customer; private final List<Book> books=new ArrayList<>();
    public Purchase(int id,Customer customer){this.id=id;this.customer=customer;}
    public void addBook(Book book){books.add(book);}
    public int getId(){return id;} public Customer getCustomer(){return customer;}
    public List<Book> getBooks(){return Collections.unmodifiableList(books);}

}
