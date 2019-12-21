package com.mulberry.demo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/demo04.do")
public class demo04 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ///TODO 请求转发
        RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
        req.setAttribute("uname","Tom");
        rd.forward(req,resp);

    }
}
