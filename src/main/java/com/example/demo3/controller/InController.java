package com.example.demo3.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class InController {

    //http://localhost:20000/echo?msg=asd
    @RequestMapping("/inner1")
    public String inner1(HttpServletRequest request, HttpServletResponse resp,  String msg) {
        System.out.println(request.getRemoteAddr());
        System.out.println(request.getRequestURL());
        System.out.println(request.getSession().getId());
        System.out.println(request.getServletContext().getRealPath("./"));
        return "hello" + msg;
    }

    //http://localhost:20000/echo2/aa

    @RequestMapping("/foo")
    void handleFoo(HttpServletResponse response) throws IOException {
        response.sendRedirect("http://www.kuwansports.com/");
    }

}
