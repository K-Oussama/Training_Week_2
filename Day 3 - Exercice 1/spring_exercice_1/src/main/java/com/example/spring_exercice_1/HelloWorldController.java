package com.example.spring_exercice_1;

import org.springframework.stereotype.Controller;

@Controller
public class HelloWorldController {
    private HelloWorldService helloWorldService;

    public HelloWorldController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @GetMapping("/hello")
    @ResponseBody
    public String helloWorld() {
        return helloWorldService.getGreeting();
    }
}
