package com.mulberry.demo03;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(
        filterName = "Filter1",
        urlPatterns = {"/test1.do"},
        initParams = {
                @WebInitParam(name="code",value = "utf-8")
        },
        servletNames = "test1"
        ,dispatcherTypes = {DispatcherType.REQUEST}
)
public class Filter1 implements Filter {
    private  String code = "";
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //初始化编码格式
        code = filterConfig.getInitParameter("code");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("进入第一个过滤器");
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        //实现编码格式
        req.setCharacterEncoding(code);
        resp.setContentType("text/html;charset=utf-8");

        //直接放行，将编码格式设置为utf-8
        chain.doFilter(request, response);
        //打印响应后进入过滤器的日志
        System.out.println("第一个过滤器结束");
    }

    @Override
    public void destroy() {

    }
}
