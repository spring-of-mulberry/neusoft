package com.mulberry.demo01;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/session01.do")
public class session extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.service(req, resp);
        req.setCharacterEncoding("utf-8");
        String uname = req.getParameter("uname");
        String pwd = req.getParameter("pwd");
        HttpSession session = req.getSession();
        session.setAttribute("uname",uname);
        session.setAttribute("pwd",pwd);
        req.getRequestDispatcher("jsp/shouye.jsp").forward(req,resp);
    }

}
