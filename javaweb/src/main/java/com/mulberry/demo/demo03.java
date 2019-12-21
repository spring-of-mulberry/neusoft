package com.mulberry.demo;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet("/demo03")
public class demo03 extends HttpServlet {
    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        super.service(request, response);
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String name =  request.getParameter("username");
        String password = request.getParameter("password");
        String[] type = request.getParameterValues("type");
        System.out.println(name);
        System.out.println(password);
        Arrays.asList(type).forEach(e-> System.out.println(e));
        request.setAttribute("name",name);
        request.setAttribute("pwd",password);
        request.setAttribute("type",type);
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }



    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
    }
}
