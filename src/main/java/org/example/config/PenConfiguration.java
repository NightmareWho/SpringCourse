package org.example.config;


import org.example.Pen;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PenConfiguration {

    @Bean
    public Pen pen() {
        return new Pen();
    }
}
