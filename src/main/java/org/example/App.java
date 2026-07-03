package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.example");
        Bookshelf bookshelf = context.getBean("bookshelf", Bookshelf.class);
        bookshelf.OpenBook();
    }
}