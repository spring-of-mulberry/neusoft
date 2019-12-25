package com.mulberry.jdbcTemp.controller;

import com.mulberry.jdbcTemp.entity.product;
import com.mulberry.jdbcTemp.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import java.util.List;

@Controller
public class productController {
    @Autowired
    private productService productService;

    //查询所有数据到显示层
    public List<product> select_all(){
        return productService.select_all();
    }

}
