package com.mulberry.demo;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/demo08")
public class demo08 extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
        ServletContext servletContext = super.getServletContext();
        String aa = servletContext.getInitParameter("aaa");
        System.out.println(aa);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
//        String name = req.getParameter("name");
//        String pwd = req.getParameter("pwd");
//        System.out.println(name);
//        System.out.println(pwd);
    }
}
