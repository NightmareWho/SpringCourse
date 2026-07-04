package ru.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConnector {

    @Value("${host}")
    private String databaseHost;

    @Value("${port}")
    private String databasePort;

    @Value("${username}")
    private String databaseUser;

    @Value("${password}")
    private String databasePassword;

    public void execureSQL(String sql) {
        System.out.println("Connecting https://" + databaseHost+ ":"+ databasePort + "?usernmae" + databaseUser + "&password=" + databasePassword);
        System.out.println("SQL [" + sql + "]");
    }

}
