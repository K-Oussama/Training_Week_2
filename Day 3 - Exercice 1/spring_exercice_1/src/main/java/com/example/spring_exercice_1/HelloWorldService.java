package com.example.spring_exercice_1;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
    public String getGreeting() {
        return "Hello, world!";
    }
}
