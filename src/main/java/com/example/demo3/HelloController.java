package com.example.demo3;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "Greetings frAAAaa啊啊om Spring Boot!";
    }



    @RequestMapping("/aa")
    public HashMap aa() {
        HashMap hashMap = new HashMap();
        hashMap.put("aaa","asf");
        hashMap.put("ccc","ccc");
        return hashMap;
    }
}
