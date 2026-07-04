package org.example;

import org.example.config.ApplicationConfiguration;
import org.example.config.BookConfiguration;
import org.example.config.PenConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        Table table = context.getBean("table", Table.class);
        table.OpenBook();
        table.lookAtPen();

    }
}