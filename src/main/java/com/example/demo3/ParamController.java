package com.example.demo3;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParamController {

    //http://localhost:20000/echo?msg=asd
    @RequestMapping("/echo")
    public String echo(String msg) {
        return "hello" + msg;
    }

    //http://localhost:20000/echo2/aa
    @RequestMapping("/echo2/{msg}")
    public String echo2(@PathVariable("msg") String msg) {
        return "hello" + msg;
    }

    @RequestMapping("/add")
    public String add(@RequestParam int a1,@RequestParam int a2) {
        int i = a1 + a2;
        return "hello  " + i;
    }
}
