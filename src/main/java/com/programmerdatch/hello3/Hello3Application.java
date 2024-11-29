package com.programmerdatch.hello3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Hello3Application {
    public static void main(String[] args) {
        SpringApplication.run(Hello3Application.class, args);
    }
}

@RestController
@RequestMapping("/")
class GreetingController {
    @GetMapping
    public String showWelcomeMsg() {
        return "Hello World";
    }
}