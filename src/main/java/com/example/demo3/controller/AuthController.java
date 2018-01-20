package com.example.demo3.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    //http://localhost:20000/auth1
    @RequestMapping("/auth1")
    public String echo() {
        return "hello auth1";
    }



}
