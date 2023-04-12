package com.example.spring_exercice_2;
import org.springframework.stereotype.Service;

public class HelloWorldService {

    @TimeIt
    public void helloWorld() {
        System.out.println("Hello, world!");
    }

}
