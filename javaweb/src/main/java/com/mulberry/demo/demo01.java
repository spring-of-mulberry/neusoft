package com.mulberry.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/demo01")
public class demo01 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter pw = response.getWriter();
        String name = request.getServerName();
        int wport = request.getServerPort();
        String url = request.getLocalAddr();
        String ip = request.getRemoteAddr();
        int port = request.getLocalPort();
        String urls = request.getRequestURI();
        pw.println("请求用户的主机名称"+name+"<br />");
        pw.println("请求用户的主机使用的网络端口"+wport+"<br />");
        pw.println("web服务器的ip地址"+ip+"<br />");
        pw.println("web服务器的主机名"+name+"<br />");
        pw.println("web服务器的端口号"+wport+"<br />");
        pw.println("网站域名"+urls+"<br />");
        pw.println("url请求端口号"+port+"<br />");
        pw.println("请求协议"+request.getRemoteUser()+"<br />");
        pw.println("请求地址"+url+"<br />");
    }
}
