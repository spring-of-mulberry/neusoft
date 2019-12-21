package com.mulberry.demo03;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(
        filterName = "Gilter2",
        urlPatterns = {"/test1.do"},
        servletNames = "test1"
)
public class Gilter2 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("进入第二个过滤器");
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        HttpSession session = req.getSession();
        //判断这个地址是否为第一次实现登录状态
        if (req.getRequestURI().indexOf("/test1.do")!=-1){//判断为第一次登录
            chain.doFilter(request,response); //放行
            return; //表示下一次进来，不再放行，直接放回到下面的操作流程
        }
        //判断是否已存入了sesson信息
        if (null!=session.getAttribute("username")){
            chain.doFilter(request,response); //放行
        }else{
            resp.sendRedirect("test1.jsp");
        }

//        System.out.println("进入第二个过滤器");

    }

    @Override
    public void destroy() {

    }
}
