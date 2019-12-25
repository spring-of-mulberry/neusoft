package com.mulberry.jdbcTemp;

import com.mulberry.jdbcTemp.controller.productController;
import com.mulberry.jdbcTemp.entity.product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class test  {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        productController productController = context.getBean(productController.class);
        List<product> list =  productController.select_all();
        list.forEach(p -> System.out.println(p));
    }
}
