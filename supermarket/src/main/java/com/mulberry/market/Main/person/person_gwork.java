package com.mulberry.market.Main.person;


import com.mulberry.market.Comment.RegExpUtil;
import com.mulberry.market.Controller.person_work.person_workController;
import com.mulberry.market.Entity.attenceinfo;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class person_gwork {
    //上班打卡
    person person = new person();
    int i;
    int userno1;//未打卡的员工编号
    person_workController pwork1 = new person_workController();//控制器对象
    person_workController pwork2 = new person_workController();
    person_workController pwork3 = new person_workController();
    List<attenceinfo> list1 = new ArrayList<attenceinfo>(); //usesrno和onduty查询到的集合
    List<attenceinfo> list2 = new ArrayList<attenceinfo>();//找到attenceinfo中所有集合
    attenceinfo attenceinfo1 = new attenceinfo();//userno和onduty要存入到的对象
    public void gwork(){
        System.out.println("进入打卡！");
        //判断是否打卡和用户是否存在
        now_userno();

        System.out.println("手动模拟打卡!输入打卡（任意值)");
        String str = new Scanner(System.in).next();
        if(str!=null){
            attenceinfo1.setOnduty(1);
        }else {
            attenceinfo1.setOnduty(1);
        }
        //设置打卡上班时间为当前打卡时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        long l = timestamp.getTime();
        java.sql.Date sqldate;
        try {
            sqldate = new java.sql.Date(sdf.parse(sdf.format(l)).getTime());
            attenceinfo1.setOndutydate(sqldate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        attenceinfo1.setAttenceno(userno1);
        pwork2.gworkdaka(attenceinfo1);
        System.out.println("上班打卡已完成！！！自动返回到收银员系统");
        person.person_UI();
    }
    public void now_userno(){
        while (true) {
            System.out.println("请输入当前登录系统员工打卡序号（数字）：");
//            可能错误：语法错误，编号存在
            String userno = new Scanner(System.in).next();
            boolean flag = RegExpUtil.checkDigit(userno);
            if (!flag) {
                System.out.println("员工打卡序号输入有误！请输入纯数字!");
                now_userno();
                break;
            }else {
                i = Integer.parseInt(userno);
                //判断表中是否有该用户
                boolean f =false;
                list2 = pwork3.worktimeByAttenceno();
                for (int j = 0; j <list2.size() ; j++) {
                    f = false;
                    if (list2.get(j).getAttenceno()==i) {
                        break;
                    }else{
                        f = true;
                    }
                }
                if (f){
                    System.out.println("没有该用户序号的打卡记录！");
                    now_userno();
                    break;
                }else {
                    int onduty = 0;
                    list1 = pwork1.useronduty(i, onduty);
                    if (list1.size() > 0) {
                        System.out.println("还未打卡！请打卡！");
                        userno1 = list1.get(0).getAttenceno();
                        break;
                    } else {
                        System.out.println("员工已打卡！退出到收银员系统");
                        person.person_UI();
                        break;
                    }
                }
            }
        }

    }
}
