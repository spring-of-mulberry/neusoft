//package com.mulberry.teacher;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@WebServlet("/login.do")
//public class LoginServlet extends HttpServlet {
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        //super.doGet(req, resp);
//        String name = req.getParameter("user");
//        req.getSession().setAttribute("user",name);
//        req.getRequestDispatcher("index.jsp").forward(req,resp);
//    }
//}
