package com.mulberry.springMVC01.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mulberry.springMVC01.entity.product;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class Freemarkercontroller {
    @RequestMapping("/test01")
    public String test01(HttpServletRequest request, ModelMap modelMap){
        product product = new product(1,"哇哈哈",20,30.5,"wahaha");

        List<String> list = new ArrayList<>();
        list.add("哇哈哈1");
        list.add("哇哈哈2");
        list.add("哇哈哈3");
        list.add("哇哈哈4");
        modelMap.addAttribute("product",product);
        modelMap.addAttribute("list",list);
        request.setAttribute("string","这是一条string句子");

        return "freemarker";

    }

}
