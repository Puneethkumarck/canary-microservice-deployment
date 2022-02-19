package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final AppProperties appProperties;

    public HelloController(AppProperties appProperties) {
        this.appProperties = appProperties;
    }

    @GetMapping("/")
    public String message(){
        return appProperties.getMessage();
    }

}
