package com.example.demo3.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class HelloController2 {
    

    @RequestMapping("/json")
    public HashMap aa() {
        HashMap hashMap = new HashMap();
        hashMap.put("aaa","asf");
        hashMap.put("ccc","ccc");
        return hashMap;
    }


}
