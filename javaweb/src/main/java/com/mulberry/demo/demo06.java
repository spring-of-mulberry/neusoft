package com.mulberry.demo;

import javax.servlet.*;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

@WebServlet(name="demo",value = "/demo06.do",loadOnStartup = 0,initParams = {@WebInitParam(name="aaaa",value = "aaaa")})
public class demo06 extends HttpServlet {
//    @Override
//    public void init() throws ServletException {
//        super.init();
//        ServletContext context = super.getServletContext();
//String a = context.getInitParameter("aaaa");
//            System.out.println(a);
//        String ss1 = context.getInitParameter("contextConfigLocation");
//        String ss2 = context.getInitParameter("webAppRootKey");
//        System.out.println(ss1);
//        System.out.println(ss2);
//        context.setAttribute("aaa","aaa");
//        String aa = context.getInitParameter("aaa");
//        System.out.println(aa);
//    }
        @Override
    public void init(ServletConfig config) throws ServletException {
//            super.init(config);
        ServletContext context = config.getServletContext();
        String ss1 = context.getInitParameter("contextConfigLocation");
        String ss2 = context.getInitParameter("webAppRootKey");
        System.out.println(ss1);
        System.out.println(ss2);
        String gen = context.getContextPath();
        System.out.println("根路径："+gen);
        String name = context.getServletContextName();
        System.out.println("web应用的名字："+name);
        String realpath = context.getRealPath(this.getClass().getName());
        System.out.println("根路径的绝对地址"+realpath);
        String a = config.getInitParameter("aaaa");
        System.out.println(a);
    }

//    @Override
//    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//        super.service(req, res);
//        String ss1 = super.getServletContext().getInitParameter("contextConfigLocation");
//        String ss2 = super.getServletContext().getInitParameter("webAppRootKey");
//        System.out.println(ss1);
//        System.out.println(ss2);
//    }
}