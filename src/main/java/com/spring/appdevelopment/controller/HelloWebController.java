/*Create a Helloworld Spring App
to display “Hello from
BridgeLabz” in a Web Page - Use MVC Controller to invoke a View i.e. HTML
when request is received and also pass Model to
be displayed.
- Use Thymeleaf to display the Model*/
package com.spring.appdevelopment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWebController {

    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("message", "Hello from BridgeLabz");
        return "index";
    }



}
