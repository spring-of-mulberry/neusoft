package com.mulberry.wx.controller.product;

import com.mulberry.wx.entity.product;
import com.mulberry.wx.service.product.productService;
import com.mulberry.wx.service.product.productServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/product.do")
public class productcontroller extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.service(req, resp);
        productService productService = new productServiceImpl();
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        String method = req.getParameter("method");
        if (method!=null&&method.equals("edit")){
            String id = req.getParameter("id");
            product product =productService.select_productByid(Integer.parseInt(id)).stream().findFirst().orElse(null);
            req.setAttribute("product",product);
            req.getRequestDispatcher("forms.jsp").forward(req,resp);
        }else{
            List<product> p =  productService.select_product();
            req.setAttribute("productlist",p);
            req.getRequestDispatcher("tables.jsp").forward(req,resp);
        }

    }
}
