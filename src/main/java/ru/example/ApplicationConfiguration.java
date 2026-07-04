package ru.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.example")
@PropertySource("classpath:application.properties")
public class ApplicationConfiguration {

}
