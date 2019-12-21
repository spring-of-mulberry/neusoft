package com.mulberry.market.Main.person;

import com.mulberry.market.Main.sale.addsale;
import com.mulberry.market.Main.sale.salegoods;

import java.util.Scanner;

public class person_calcu {
    public void personcalcu(){
        System.out.println("******收银结算********");
        System.out.println("1.收银操作");
        System.out.println("2.收银记录表");
        System.out.println("3.退出到收银员主界面");
        System.out.println("**********************");
        System.out.println("选择操作序号：");
        String str = new Scanner(System.in).next();
        if (str.equals("1")){
            System.out.println("进入收银操作！");
            addsale addsale = new addsale();
            addsale.add_sale();
        }else if (str.equals("2")){
            person_goods person_goods = new person_goods();
            person_goods.person_sale();
        }else if (str.equals("3")){
            person p = new person();
            p.person_UI();
        }else{
            System.out.println("序号有误！请重新输入！");
            personcalcu();
        }
    }
}
