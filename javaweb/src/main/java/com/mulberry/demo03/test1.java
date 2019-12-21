package com.mulberry.demo03;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/test1.do")
public class test1 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.service(req, resp);
        String name = req.getParameter("username");
        //将用户信息存入到session中
        HttpSession session = req.getSession();
        session.setAttribute("username",name);//将获取到的数据放入session中
        req.getRequestDispatcher("test11.jsp").forward(req,resp);
    }
}
