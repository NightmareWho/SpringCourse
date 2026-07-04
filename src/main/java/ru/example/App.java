package ru.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("ru.example");
        DatabaseConnector databaseConnector = context.getBean("databaseConnector", DatabaseConnector.class);
        databaseConnector.execureSQL("SELECT * FROM STUDENTS");
    }
}
