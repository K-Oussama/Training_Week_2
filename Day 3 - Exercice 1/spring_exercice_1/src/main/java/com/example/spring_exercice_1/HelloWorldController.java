package com.example.spring_exercice_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class HelloWorldController {
    private final HelloWorldService helloWorldService;

    @Autowired
    public HelloWorldController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @GetMapping("/hello")
    @ResponseBody
    public String helloWorld() {
        return helloWorldService.getGreeting();
    }
}
