package org.example.config;

import org.example.Table;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        Table table = context.getBean("table", Table.class);
        table.OpenBook();
        table.lookAtPen();

    }
}