package com.example.demo3.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class InController {

    //http://localhost:20000/echo?msg=asd
    @RequestMapping("/aaa")
    public String echo(HttpServletRequest request, HttpServletResponse resp,  String msg) {
        System.out.println(request.getRemoteAddr());
        System.out.println(request.getRequestURL());
        System.out.println(request.getSession().getId());
        System.out.println(request.getServletContext().getRealPath("./"));
        return "hello" + msg;
    }

    //http://localhost:20000/echo2/aa

}
