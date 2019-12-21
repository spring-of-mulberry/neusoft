package com.mulberry.demo;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;


@WebServlet(
        value = "/demo05.do",
        initParams = {
        @WebInitParam(name = "num01" ,value = "001"),
        @WebInitParam(name="num02",value = "002")
        }
)
public class demo05 extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        super.service(req, res);
        req.setCharacterEncoding("utf-8");
//        res.setCharacterEncoding();
        res.setContentType("text/html;charset=utf-8");
        String num02 = super.getInitParameter("num02");
//        String num022 = super.getServletContext().getInitParameter("num02"); 错误
//        Enumeration<String> stringEnum = super.getServletContext().getInitParameterNames(); 错误
        System.out.println(num02);
//        System.out.println(num022);
//        System.out.println(stringEnum);
//        Arrays.asList(stringEnum).forEach(e-> System.out.println(e));
    }
}
