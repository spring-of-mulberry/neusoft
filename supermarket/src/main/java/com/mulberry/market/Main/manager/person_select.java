package com.mulberry.market.Main.manager;

import com.mulberry.market.Controller.attence_select.attence_selectController;
import com.mulberry.market.Entity.attenceinfo;

import java.util.List;
import java.util.Scanner;

public class person_select{
    //管理员查询收银员考勤表
    public void person_all(){
        System.out.println("编号\t员工编号\t上班打卡\t上班打卡时间\t下班打卡\t下班打卡时间");
        attence_selectController asc = new attence_selectController();
        List<attenceinfo> list = asc.attence_selece();
        for (attenceinfo a : list
                ) {
            System.out.println(a.getAttenceno() + "\t" + a.getUserno() + "\t" + a.getOnduty() + "\t" + a.getOndutydate() + "\t" + a.getOffduty() + "\t" + a.getOffdutydate());
        }
        System.out.println("操作序号：（1.在打印一遍考勤表，2.返回到上一级）");
        while (true) {
            System.out.println("选择你要操作的序号：");
            String str = new Scanner(System.in).next();
            if (str.equals("1")){
                this.person_all();
                break;
            }else if (str.equals("2")){
                manager manager = new manager();
                manager.manager_UI();
                break;
            }else{
                System.out.println("输入的操作序号有误！请重新输入！");
            }
        }

    }
}
