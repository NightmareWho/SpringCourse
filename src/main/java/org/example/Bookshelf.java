package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class Bookshelf {
    private final List<Book> bookList;
    private final Map<String, Book> bookMap;

    @Autowired
    public Bookshelf(List<Book> bookList, Map<String, Book> bookMap){
        this.bookList = bookList;
        this.bookMap = bookMap;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public Map<String, Book> getBookMap() {
        return bookMap;
    }
}
