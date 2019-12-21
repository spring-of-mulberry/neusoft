package com.mulberry.market.Main.login;

import com.mulberry.market.Controller.login.marketController;
import com.mulberry.market.Controller.person_work.person_workController;
import com.mulberry.market.Entity.attenceinfo;
import com.mulberry.market.Entity.userinfo;
import com.mulberry.market.Main.manager.manager;
import com.mulberry.market.Main.person.person;

import java.util.List;
import java.util.Scanner;

public class login {
    public marketController mc = new marketController();
    public String username;//输入用户名
    public String password;//输入密码
    public static int publicname;
    //用户登录模块
    public userinfo userinfo01 = null;//
    //添加记录到考勤表
    public attenceinfo attenceinfo1 = new attenceinfo();
    Scanner in = new Scanner(System.in);
    public void login_user(){
        System.out.println("是否进行登录操作？是（Y/y），否（N/n）");
        String str = in.next();
        if (str.equals("Y")||str.equals("y")){

            System.out.println("欢迎进入mulberry超市登录界面！");
            enter();
        }else{
            System.out.println("您已退出登录操作！程序退出！");
            System.exit(0);
        }
    }
    public void enter(){
        while (true) {
            System.out.println("请输入账号：");
            username = in.next();
            System.out.println("请输入密码：");
            password = in.next();
            mc = new marketController();
            List<userinfo> user = mc.userlogin(username,password);
            try {
                userinfo01 = user.get(0);
            } catch (Exception e) {
            }
            if (userinfo01!=null){
                if (userinfo01.getIsadmin()==1){
                    if (userinfo01.getIsenable()==1){
                        publicname = userinfo01.getUserno();
                        manager manager = new manager();
                        manager.manager_UI();
                        break;
                    }else{
                        System.out.println("该管理员账户没有激活或无该账户");
                        enter();
                        break;
                    }
                }else {
                    if (userinfo01.getIsenable() == 1) {
                        publicname = userinfo01.getUserno();
                        //添加数据到考勤表
                        person_workController p = new person_workController();
                        attenceinfo1.setUserno(userinfo01.getUserno());
                        attenceinfo1.setOnduty(0);
                        attenceinfo1.setOffduty(0);
                        p.gworkByAttenceno(attenceinfo1);
//                            进入到收银员系统
                        person person = new person();
                        person.person_UI();
                        break;
                    } else {
                        System.out.println("该收银员账户没有激活或无该账户");
                        enter();
                        break;
                    }
                }
            }
            else{
                System.out.println("用户名或密码输入有误！请重新输入！");
                enter();
                break;
            }
        }
    }
}
