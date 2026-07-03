package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.example");
        Table table = context.getBean("table", Table.class);
        table.OpenBook();

        Bookshelf bookshelf = context.getBean("bookshelf", Bookshelf.class);
        System.out.println(bookshelf.getBookList());
        System.out.println(bookshelf.getBookMap());
    }
}