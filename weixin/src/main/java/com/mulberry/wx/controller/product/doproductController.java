package com.mulberry.wx.controller.product;

import com.mulberry.wx.comm.BeanTools;
import com.mulberry.wx.entity.product;
import com.mulberry.wx.service.product.productService;
import com.mulberry.wx.service.product.productServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/doproduct.do")
public class doproductController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.service(req, resp);
        productService productService = new productServiceImpl();
        req.setCharacterEncoding("utf-8");
        String method = req.getParameter("method");
        if ("delete".equals(method)){
            String id = req.getParameter("id");
            productService.delete_product(Integer.parseInt(id));
        }else if ("add".equals(method)){
            product product = BeanTools.requestToBean(req,product.class);
            productService.add_product(product);

        }else if (method.equals("update")){
            product product = BeanTools.requestToBean(req,product.class);
            productService.update_product(product);
        }
        req.getRequestDispatcher("product.do").forward(req,resp);

    }
}
