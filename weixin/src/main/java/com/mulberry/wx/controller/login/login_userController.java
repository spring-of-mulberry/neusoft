package com.mulberry.wx.controller.login;

import com.mulberry.wx.entity.admin;
import com.mulberry.wx.service.login.loginService;
import com.mulberry.wx.service.login.loginServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/loginuser.do")
public class login_userController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.service(req, resp);
        loginService loginService = new loginServiceImpl();
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        //从前台获取到一个用户名
        String username = req.getParameter("username");
        String pwd = req.getParameter("password");
        HttpSession session = req.getSession();

        List<admin> list = loginService.login(username,pwd);
        admin admin = list.stream().findFirst().orElse(null);
        if (null==admin){
//            System.out.println("不存在");
            req.setAttribute("admin","用户名或密码错误");
            req.getRequestDispatcher("index.jsp").forward(req,resp);
        }else{
//            System.out.println("正确进入");
            session.setAttribute("username",username);
            req.getRequestDispatcher("dashboard.jsp").forward(req,resp);
        }

    }
}
