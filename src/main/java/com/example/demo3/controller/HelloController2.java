package com.example.demo3.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
public class HelloController2 {
    
    @RequestMapping("/r1")
    @ResponseBody
    public String index() {
        return "aa";
    }



    @RequestMapping("/r2")
    @ResponseBody
    public HashMap aa() {
        HashMap hashMap = new HashMap();
        hashMap.put("aaa","aaa");
        hashMap.put("ccc","ccc");
        return hashMap;
    }
}
