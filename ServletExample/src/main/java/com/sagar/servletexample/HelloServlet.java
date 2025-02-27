package com.sagar.servletexample;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class HelloServlet extends HttpServlet {
    @Override
    public void service(HttpServletRequest rq, HttpServletResponse res) throws IOException {
        System.out.println("Ins service");
        res.getWriter().println("Hello Sagar");
    }
}
