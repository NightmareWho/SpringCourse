package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("prototype")
public class Book1 implements Book {

    public Book1() {
        System.out.println("Book1 has been created");
    }

    @PostConstruct
    private void  init() {
        System.out.println("Init методы был вызван");
    }

    @PreDestroy
    private void  destroy() {
        System.out.println("Destroy методы был вызван");
    }

    @Override
    public void open() {
        System.out.println("Я был готов любить весь мир, — меня никто не понял: и я выучился ненавидеть.");
    }
}
