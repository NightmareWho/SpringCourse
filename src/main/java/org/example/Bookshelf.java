package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bookshelf {
    private Book book;

    @Autowired
    public Bookshelf(Book book){
        this.book = book;
        System.out.println("Bookshelf been is created");
    }

    public void setBook(Book book){
        System.out.println("Bookshelf been: set value to book field");
    }

    public void OpenBook() {
        System.out.println("The book is opening...");
        book.open();
    }
}
