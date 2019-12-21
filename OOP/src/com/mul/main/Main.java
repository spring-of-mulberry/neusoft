package com.mul.main;

import com.mul.entity.Price;
import com.mul.entity.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //显示菜单
        showMenu();
        //
    }

    /**
     * 主界面
     * 1.商品信息查看
     * 2.管理商品信息
     * 0.退出程序
     */
    public static void menu(){
        System.out.println("************************");
        System.out.println("    1.查看商品信息");
        System.out.println("    2.管理商品信息");
        System.out.println("    0.退出程序");
        System.out.println("************************");
        System.out.println("请输入你要操作的序号：（1查看商品，2管理商品，0退出系统）");
        System.out.println("输入序号：");

    }
    //显示菜单
    public static void showMenu(){
        //显示菜单
        menu();
        //选择
        boolean flag = true;
        Scanner in = new Scanner(System.in);
        String num = in.next();
        while (flag){
            if (num.equals("1")){
                showPro.showProducts();
                break;
            }
            else if (num.equals("2")){
                //管理商品信息
                operatePrice.operate();
                break;
            }
            else if (num.equals("0")){
                System.out.println("您已经退出该系统！");
                flag = false;
                break;
            }else{
                System.out.println("您输入的操作号有误！请重新输入！");
                System.out.println("输入序号：");
                num = in.next();
            }
        }
    }
}



