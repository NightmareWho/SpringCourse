package org.example;

import org.springframework.stereotype.Component;

@Component
public class Pencil {

    public Pencil(){
        System.out.println("Pencil bean is created");
    }

    public String getMark(){
        return "ErichCrause";
    }
}
