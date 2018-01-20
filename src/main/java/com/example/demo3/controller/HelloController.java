package com.example.demo3.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "Greetings frAAAaa啊啊om Spring Boot!";
    }

    @RequestMapping("/aa")
    public String aa() {
        return "Greetings frAAAaa啊啊om Spring Boot!";
    }



}
