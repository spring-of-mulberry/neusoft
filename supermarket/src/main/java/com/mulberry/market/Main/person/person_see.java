package com.mulberry.market.Main.person;

import com.mulberry.market.Controller.person_work.person_workController;
import com.mulberry.market.Entity.attenceinfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class person_see {
    person_workController p = new person_workController();
    List<attenceinfo> list1 = new ArrayList<attenceinfo>();
    attenceinfo attenceinfo1 = new attenceinfo();
    public void  person_look(){
        System.out.println("*********打卡状态查看************");
        list1 = p.worktimeByAttenceno();
        System.out.println("编号\t员工编号\t上班打卡\t上班打卡时间\t下班打卡\t下班打卡时间");
        for (int i = 0; i <list1.size() ; i++) {
            System.out.println(list1.get(i).getAttenceno()+"\t"+list1.get(i).getUserno()+"\t"+list1.get(i).getOnduty()+"\t"+list1.get(i).getOndutydate()+"\t"+list1.get(i).getOffduty()+"\t"+list1.get(i).getOffdutydate());
        }
        //手动返回上级操作
        System.out.println("输入任何字符返回到上级操作！");
        System.out.println("字符：");
        String str = new Scanner(System.in).next();
        while (true){
            if (str!=null){
                new person().person_UI();
                break;
            }else {
                new person().person_UI();
                break;
            }
        }

    }
}
