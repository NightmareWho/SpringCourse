package org.example;

import org.springframework.stereotype.Component;

@Component
public class Book1 implements Book {

    public Book1() {
        System.out.println("Book1 has been created");
    }

    @Override
    public void open() {
        System.out.println("Я был готов любить весь мир, — меня никто не понял: и я выучился ненавидеть.");
    }
}
