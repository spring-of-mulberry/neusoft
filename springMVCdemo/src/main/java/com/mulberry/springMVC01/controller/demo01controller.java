package com.mulberry.springMVC01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

@Controller
@RequestMapping("/controller")
public class demo01controller {

    @RequestMapping("/demo01")
    public String demo01(HttpServletRequest request){
        String uri = request.getRequestURI();
        System.out.println(uri);
        return  "/demo01.jsp";
    }

    @RequestMapping("/demo02")
    public String demo02(HttpServletRequest request){
        try {
            request.setCharacterEncoding("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String uname = request.getParameter("uname");
        String pwd = request.getParameter("password");
        String age = request.getParameter("age");
        String details = request.getParameter("details");
        request.setAttribute("uname",uname);
        request.setAttribute("password",pwd);
        request.setAttribute("age",age);
        request.setAttribute("details",details);
        return "/demo02.jsp";
    }
}
