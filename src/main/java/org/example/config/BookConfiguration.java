package org.example.config;

import org.example.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookConfiguration {

    @Bean
    public Book1 book1() {
        return new Book1();
    }

    @Bean
    public Book2 book2() {
        return new Book2();
    }

    @Bean
    public Table table(@Qualifier("book1") Book book, Pen pen) {
        return new Table(book, pen);
    }
}
