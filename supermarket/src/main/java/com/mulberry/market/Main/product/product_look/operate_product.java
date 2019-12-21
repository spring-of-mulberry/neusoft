package com.mulberry.market.Main.product.product_look;

import com.mulberry.market.Main.manager.manager;

import java.util.Scanner;

//库存表中的查看和修改
public class operate_product {
    Scanner in  = new Scanner(System.in);
    //总目录
    public void operateproduct(){
        System.out.println("********库存记录报表*************");
        System.out.println("1.查看所有库存表数据");
        System.out.println("2.查询一条数据");
        System.out.println("3.修改数据");
        System.out.println("4.删除一条数据");
        System.out.println("5.退出库存记录报表");
        System.out.println("*********************************");
        select_one();
    }
    //选择
    public void select_one(){
        System.out.println("选择操作序号：");
        String str = in.next();
        if (str.equals("1")){
            System.out.println("查看所有库存数据！");
            select_product select_product1 = new select_product();
            select_product1.selectproduct();
        }else if (str.equals("2")){
            System.out.println("查看一条库存数据");
            select_product select_product2 = new select_product();
            select_product2.selectproductBycode();
        }else  if (str.equals("3")){
            System.out.println("修改库存数据");
            do_product do_product1 = new do_product();
            do_product1.updateproductBycode();
        }else  if (str.equals("4")){
            System.out.println("删除库存数据");
            do_product do_product2 = new do_product();
            do_product2.deleteproductBycode();
        }else  if (str.equals("5")){
            System.out.println("退出库存记录报表");
            manager m1 = new manager();
            m1.manager_UI();
        }else{
            System.out.println("输入的序号有误！请重新输入！！");
            select_one();
        }
    }
















}
