package com.mulberry.demo;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/user","/user.do","/user/user.do"} ,
initParams={
        @WebInitParam(name="name",value = "zhangsan"),
        @WebInitParam(name="pwd",value = "123456")
})
public class demo02 extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        String name = config.getInitParameter("name");
        String pwd = config.getInitParameter("pwd");
        System.out.println(name+pwd);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter pw = resp.getWriter();
        pw.print("userservlet");
        pw.close();
    }
}
