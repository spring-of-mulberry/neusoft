package com.mulberry.wx.controller.testbaseServlet;

import com.mulberry.wx.comm.BeanTools;
import com.mulberry.wx.comm.baseServlet;
import com.mulberry.wx.entity.product;
import com.mulberry.wx.service.product.productService;
import com.mulberry.wx.service.product.productServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/test.do/*")
public class allServlet extends baseServlet {
    productService productService = new productServiceImpl();
//    查询
    public void select_all(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        List<product> list =  productService.select_product();
        request.setAttribute("listproduct",list);
        request.getRequestDispatcher("/tables.jsp").forward(request,response);
    }
//    删除
    public void delete(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String id = request.getParameter("id");
        productService.delete_product(Integer.parseInt(id));
        this.select_all(request,response);
    }
    //    增加
    public void add(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        product product = BeanTools.requestToBean(request,product.class);
        productService.add_product(product);
        this.select_all(request,response);
    }
    //    修改
    public void update(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        product product = BeanTools.requestToBean(request,product.class);
        productService.update_product(product);
        this.select_all(request,response);
    }

    public void doselect_all(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String id = request.getParameter("id");
        product product =productService.select_productByid(Integer.parseInt(id)).stream().findFirst().orElse(null);
        request.setAttribute("product",product);
        request.getRequestDispatcher("/forms.jsp").forward(request,response);
    }

}
