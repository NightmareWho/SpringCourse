package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.example");
        Book book = context.getBean("book1", Book.class);

        book.open();
        context.close();
        System.out.println("Программа завершена");
    }
}