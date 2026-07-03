package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.example");
        Book book1 = context.getBean("book1", Book.class);
        Book book2 = context.getBean("book2", Book.class);
        System.out.println("book1 и book2 равны? :" + (book1 == book2));
        System.out.println(book1);
        System.out.println(book2);
    }
}