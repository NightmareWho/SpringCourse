package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Table {
    private Book book;

    @Autowired
    public Table(@Qualifier("book1") Book book){
        this.book = book;
        System.out.println("Table been is created");
    }

    public void OpenBook() {
        System.out.println("The book is opening...");
        book.open();
    }
}
