package com.example.demo3.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/myservlet")
public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
//        PrintWriter writer = resp.getWriter();
//        writer.write("asdasdasd");
//        writer.flush();
//        writer.close();;
//        super.doGet(req, resp);
        response.sendRedirect("http://www.kuwansports.com/");
    }
}
