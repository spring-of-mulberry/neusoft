package com.mulberry.demo01;

import org.omg.CORBA.StringHolder;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet("/cookie.do")
public class cookie extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//        super.service(req, res);
        req.setCharacterEncoding("utf-8");
        res.setContentType("text/html;charset=utf-8");
//        String names = session.setAttribute
        String name = req.getParameter("username");//获取用户名
        String pwd = req.getParameter("password");//获取密码
        String[] type = req.getParameterValues("type");//获取类型
        System.out.println(name+"---"+pwd+"---"+type);
        Cookie cookie1 = new Cookie("username",name);
        Cookie cookie2 = new Cookie("pwd",pwd);
        cookie1.setMaxAge(60*60*24);
        cookie2.setMaxAge(60*60*24);
//        req.seutAttribute("username",cookie1.getValue());
////        req.setAttribte("pwds",cookie2.getValue());
        req.getRequestDispatcher("demo03.jsp").forward(req,res);
    }

}
