package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Book2 implements Book {

    public Book2() {
        System.out.println("Book2 has been created");
    }

    @Override
    public void open() {
        System.out.println("Бывает, однако в жизни и так, что приходиться делать выбор между тем, чего ты хочешь, и тем, во что ты веришь");
    }
}
