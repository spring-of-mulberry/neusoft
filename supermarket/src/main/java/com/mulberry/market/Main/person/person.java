package com.mulberry.market.Main.person;

import com.mulberry.market.Main.login.login;
import com.mulberry.market.Main.manager.person_select;
import com.mulberry.market.Main.manager.person_userinfo;
import com.mulberry.market.Main.sale.addsale;

import java.util.Scanner;

public class person {
    public void person_UI(){
        System.out.println("*************收银员管理系统*****************");
        System.out.println("1.收银员上班打卡");
        System.out.println("2.收银员下班打卡");
        System.out.println("3.收银员状态查看");
        System.out.println("4.收银结算");
        System.out.println("5.退出到登录系统");
        System.out.println("********************************************");
        select_person();
    }
    public void select_person(){
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("选择你要操作的序号：");
            String str = in.next();
            if (str.equals("1")){
                System.out.println("进入到打卡上班操作");
                person_gwork pgwork = new person_gwork();
                pgwork.gwork();
                break;
            }else if (str.equals("2")){
                System.out.println("进入到打卡下班操作");
                person_lwork plwork = new person_lwork();
                plwork.lwork();
                break;
            }else if (str.equals("3")){
                System.out.println("收银员状态查看");
                person_see psee = new person_see();
                psee.person_look();
                break;
            }else if (str.equals("4")){
                System.out.println("收银结算");
                person_calcu person_calcu = new person_calcu();
                person_calcu.personcalcu();
                break;
            }else if (str.equals("5")){
                System.out.println("您已经退出到登录操作！！！！！！！！");
                login login = new login();
                login.login_user();
                break;
            }else{
                System.out.println("序号输入有误！请重新输入！");
                select_person();
                break;
            }
        }
    }
}
