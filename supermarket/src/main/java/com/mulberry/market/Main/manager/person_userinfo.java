package com.mulberry.market.Main.manager;

import com.mulberry.market.Comment.RegExpUtil;
import com.mulberry.market.Controller.person_userinfo.person_userinfoController;
import com.mulberry.market.Controller.person_userinfo.person_userinfoNOC;
import com.mulberry.market.Entity.userinfo;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class person_userinfo {
    public void person_all(){
        person_see();
    }
    //菜单栏
    public void person_see(){
        System.out.println("*******收银员信息管理******");
        System.out.println("1.查询收银员信息");
        System.out.println("2.增加收银员信息");
        System.out.println("3.修改收银员信息");
        System.out.println("4.删除收银员信息");
        System.out.println("5.返回到上级管理员系统");
        System.out.println("***************************");
        iswhat();
    }
    //判断选项
    public  void iswhat(){
        System.out.println("请选择您要做的操作序号：（1查询，2增加，3修改，4删除，5返回上级）");
        System.out.println("操作序号：");
        String str = new Scanner(System.in).next();
        while (true){
            if (str.equals("1")){
                person_select();
                break;
            }else if (str.equals("2")){
                person_insert();
                break;
            }else if (str.equals("3")){
                person_update();
                break;
            }else if (str.equals("4")){
                person_delete();
                break;
            }else if (str.equals("5")){
                manager manager = new manager();
                manager.manager_UI();
                break;
            }else{
                System.out.println("您输入的序号有错误！请重新输入！");
                iswhat();
            }
            break;
        }
    }
    //返回上级操作(最后操作)
    public void upper(){
        //手动返回上级操作
        System.out.println("输入任何字符返回到上级操作！");
        System.out.println("字符：");
        String str = new Scanner(System.in).next();
        while (true){
            if (str!=null){
                person_see();
                break;
            }else {
                person_see();
                break;
            }
        }
    }


    //查询业务
    person_userinfoController pucontroller = new person_userinfoController() ;
    //isadmin查询集合
    List<userinfo> list = new ArrayList<userinfo>();
    public void person_select(){
        int admin = 0;
        list = pucontroller.person_userinfo_select(admin);
        System.out.println("***********收银员信息表******************");
        System.out.println("用户编号\t姓名\t电话\t\t\t账号\t\t是否激活");
        for (userinfo u :list
             ) {
            System.out.println(u.getUserno()+"\t\t\t"+u.getUname()+"\t"+u.getPhone()+"\t\t"+u.getAccount()+"\t\t"+u.getIsenable());
        }
        //手动返回上级操作
        upper();
    }


    //增加业务
    //将数据添加到这
    userinfo user = new userinfo();
    public void person_insert(){
        System.out.println("******收银员信息增加系统**********");
        System.out.println("返回到上级按（e/E）,若不则按任意键继续！");
        String str = new Scanner(System.in).next();
        if (str.equals("e")||str.equals("E")){
            person_see();
        }else {
            //判断用户编号(在下面一个方法中操作的)
            insert_userno();

            //判断姓名
            System.out.println("请输入收银员姓名（汉字）：");
            String s = new Scanner(System.in).next();
            user.setUname(s);
            //判断电话
            while (true) {
                System.out.println("请输入收银员电话：");
                String iphone = new Scanner(System.in).next();
                boolean f = RegExpUtil.checkMobile(iphone);
                if (f) {
                    user.setPhone(iphone);
                    break;
                } else {
                    System.out.println("电话填写错误！请重新填写！（手机号码）");
                }
            }
            //判断账号
            insert_account();

            //判断密码
            System.out.println("请输入密码：");
            String pwd = new Scanner(System.in).next();
            user.setPwd(pwd);
            //判断是否为管理员
            int isadmin = 0;
            user.setIsadmin(isadmin);
            //判断是否激活
            System.out.println("请输入是否激活（激活1，不激活0）：");
            int isenable = new Scanner(System.in).nextInt();
            user.setIsenable(isenable);
            System.out.println("添加成功！！！！！");
            //添加操作
            person_userinfoController personuser = new person_userinfoController();
            personuser.person_userinfo_insert(user);
            upper();
        }
    }
    //判断用户编号是否正确，并插入表中
    List<userinfo> list1 = new ArrayList<userinfo>();
    userinfo u = new userinfo();
    person_userinfoNOC personNOC = new person_userinfoNOC();
    int i;
    public void insert_userno(){
        while (true) {
            System.out.println("请输入收银员编号（数字）：");
//            可能错误：语法错误，编号存在
            String userno = new Scanner(System.in).next();
            boolean flag = RegExpUtil.checkDigit(userno);
            if (!flag) {
                System.out.println("收银员编号输入有误！请输入纯数字!");
                insert_userno();
                break;
            }else {
                i = Integer.parseInt(userno);
                list1 = personNOC.person_userinfo_selectNo(i);
                if (list1.size()>0) {
                    System.out.println("收银员编号存在！请重新输入！");
                    insert_userno();
                    break;
                } else {
                    user.setUserno(i);
                    break;
                }
            }
        }
    }
    //判断账号是否正确，并插入表中
    List<userinfo> user1 = new ArrayList<userinfo>();//返回集合
    public void insert_account(){
        while(true){
            System.out.println("请输入账号：");
            String account = new Scanner(System.in).next();
            //判断账号是否存在
            user1 = pucontroller.person_userinfoAccount_select(account);//返回一个集合
            if (user1.size()>0){
                System.out.println("该账号已存在！请重新输入一个账号！");
                insert_account();
                break;
            }else {
                user.setAccount(account);
                break;
            }
        }
    }


    //修改业务(姓名，电话，是否为管理员，是否激活)
    List<userinfo> u2 = new ArrayList<userinfo>();//接受通过账号传来的信息集合
    userinfo user2 = new userinfo();//接受集合中传过来的对象
    userinfo user3 = new userinfo();//存储修改之后的数据
    public void person_update(){
        System.out.println("******收银员信息更改系统**********");
        System.out.println("返回到上级按（e/E）,若不则按任意键继续！");
        String str5 = new Scanner(System.in).next();
        if (str5.equals("e")||str5.equals("E")){
            person_see();
        }else {
            //判断账号是否存在/账号是否为收银员
            String account;
            while (true) {
                System.out.println("输入要修改的收银员账号：");
                account = new Scanner(System.in).next();
                u2 = pucontroller.person_userinfoAccount_select(account);
                if (u2.size() > 0) {
                    user2 = u2.get(0);
                    if (user2.getIsadmin() == 1) {
                        System.out.println("该用户为管理员！不允许修改信息！请重新输入！！");
                    } else {
                        break;
                    }
                } else {
                    System.out.println("输入的账号不存在！！请重新输入！！");
                }
            }
            System.out.println("将姓名修改为：");
            String str1 = new Scanner(System.in).next();
            user3.setUname(str1);
            while (true) {
                System.out.println("将电话修改为：");
                String str2 = new Scanner(System.in).next();
                boolean f = RegExpUtil.checkMobile(str2);
                if (f) {
                    user3.setPhone(str2);
                    break;
                } else {
                    System.out.println("电话为手机号！请重新输入");
                }
            }
            System.out.println("是否将该收银员设置成管理员？（是：输入Y/y，否：则输入任意值）");
            String str3 = new Scanner(System.in).next();
            if (str3.equals("y") || str3.equals("Y")) {
                int ii1 = 1;
                user3.setIsadmin(ii1);
            } else {
                int ii2 = 0;
                user3.setIsadmin(ii2);
            }
            System.out.println("是否将该收银员设置成激活状态？（是：输入Y/y，否：则输入任意值）");
            String str4 = new Scanner(System.in).next();
            if (str4.equals("y") || str4.equals("Y")) {
                int ii1 = 1;
                user3.setIsenable(ii1);
            } else {
                int ii2 = 0;
                user3.setIsenable(ii2);
            }
            user3.setAccount(account);
            pucontroller.person_userinfo_update(user3);
            System.out.println("修改成功！！！");
            //手动返回上级操作
            System.out.println("输入任何字符返回到上级操作！");
            System.out.println("字符：");
            String str = new Scanner(System.in).next();
            while (true) {
                if (str != null) {

                    person_see();
                    break;
                } else {

                    person_see();
                    break;
                }
            }
        }
    }


    //删除业务（根据账号删除）
    person_userinfoController pp = new person_userinfoController();
    userinfo user5 = new userinfo();
    String account;
    List<userinfo> u3 = new ArrayList<userinfo>();//接受通过账号传来的信息集合
    public void person_delete(){
        System.out.println("******收银员信息删除系统**********");
        System.out.println("返回到上级按（e/E）,若不则按任意键继续！");
        String str1 = new Scanner(System.in).next();
        if (str1.equals("e")||str1.equals("E")){
            person_see();
        }else {
            //判断账号是否存在/账号是否为收银员
            delete();
            System.out.println("删除收银员信息成功！！！");
            //手动返回上级操作
            System.out.println("输入任何字符返回到上级操作！");
            System.out.println("字符：");
            String str = new Scanner(System.in).next();
            while (true) {
                if (str != null) {
                    person_see();
                    break;
                } else {
                    person_see();
                    break;
                }
            }
        }
    }
    //判断能否删除
    public void delete(){
        while (true) {
            System.out.println("输入要删除的收银员账号：");
            account = new Scanner(System.in).next();
            u3 = pp.person_userinfoAccount_select(account);
            if (u3.size()>0) {
                user5 = u3.get(0);
                if (user5.getIsadmin()==1){
                    System.out.println("该用户为管理员！不允许删除信息！请重新输入！！");
                    delete();
                    break;
                }else{
                    pp.person_userinfo_delete(account);
                    break;
                }
            }else{
                System.out.println("输入的账号不存在！！请重新输入！！");
                delete();
                break;
            }
        }
    }
}

