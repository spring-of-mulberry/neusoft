package com.mulberry.demo;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

@WebServlet(value="/demo07",loadOnStartup = 1)
public class demo07 extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        super.service(req, res);
        String ss = super.getServletContext().getInitParameter("contextConfigLocation1");
        System.out.println(ss);
    }
}
