package com.mulberry.market.Main.product.in_out_operate;

import com.mulberry.market.Main.manager.manager;

import java.util.Scanner;

//商品上架和下架
public class in_and_out {
    //上下架总菜单
    public void inandout(){
        System.out.println("********商品上下架菜单***********");
        System.out.println("1.商品上架");
        System.out.println("2.商品下架");
        System.out.println("3.商品上下架信息表");
        System.out.println("4.返回到管理员管理系统");
        System.out.println("*********************************");
        inandout_select();
    }
    //选择
    public void inandout_select(){
        System.out.println("选择操作序号：");
        String str = new Scanner(System.in).next();
        if (str.equals("1")){
            System.out.println("商品上架操作！");
            in_operate in_operate = new in_operate();
            in_operate.inoperate();
        }else if (str.equals("2")){
            System.out.println("商品下架操作");
            out_operate out_operate = new out_operate();
            out_operate.outoperate();
        }else  if (str.equals("3")){
            System.out.println("打开商品上下架信息表");
            in_out_select in_out_select = new in_out_select();
            in_out_select.inoutselect();
        }else  if (str.equals("4")){
            manager manager = new manager();
            manager.manager_UI();
        }else{
            System.out.println("输入的序号有误！请重新输入！！");
            inandout_select();
        }
    }
}
