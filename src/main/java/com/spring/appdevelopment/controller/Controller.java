package com.spring.appdevelopment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
    @GetMapping("/hello")
    public String getHello(){
        return "Hello from Bridgelabz";

    }
     @GetMapping("/Hello")
    public String hello(Model model){

        return "Hello ";
    }
}
