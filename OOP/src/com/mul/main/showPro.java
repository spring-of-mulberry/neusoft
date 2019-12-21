package com.mul.main;

import com.mul.entity.Price;
import com.mul.entity.Product;

import java.util.*;

public class showPro {
    //展示商品信息
    public static void showProducts(){
        List<Product> products = getProduct.getProduct();
        System.out.println("*******************************************************************************************************");
        System.out.println("***商品信息展示***");
        System.out.println("商品编号\t商品名称\t商品保修时间(年)\t商品价格\t是否促销");
        for (Product p : products
             ) {
            System.out.println(p.getPid()+"\t\t"+p.getPname()+"\t\t"+p.getPdate()+"\t\t\t\t"+p.getPprice()+"\t\t"+p.isCx());
        }
        System.out.println("*******************************************************************************************************");
        System.out.println("请输入操作序号：（1返回到菜单目录,2修改商品信息,0退出系统）");
        System.out.println("操作序号：");
        doShow();
    }
    //商品展示中的操作
    public static void doShow(){

        String n = new Scanner(System.in).next();
        while (true) {
            if (n.equals("1")) {
                //返回到菜单
                Main.showMenu();
                break;
            } else if (n.equals("2")) {
                //管理商品信息
                operatePrice.operate();
                break;
            } else if (n.equals("0")) {
                System.out.println("您已经退出商品信息系统！");
                break;
            } else {
                System.out.println("您输入的操作号有误！请重新输入！");
                System.out.println("操作序号（数字）：");
                n = new Scanner(System.in).next();
            }
        }
    }
}
