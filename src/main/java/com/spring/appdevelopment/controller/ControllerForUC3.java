/*Create a Helloworld Spring
App to display “Hello from
BridgeLabz” in REST Call
- Use REST Controller to respond to the REST
Request.*/
package com.spring.appdevelopment.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerForUC3 {
    @GetMapping("/Hello")
    public String hello(Model model){

        return "Hello ";
    }
}
