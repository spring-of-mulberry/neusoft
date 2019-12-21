package com.mulberry.market.Controller.person_work;

import com.mulberry.market.Entity.attenceinfo;
import com.mulberry.market.Service.person_work.person_workService;
import com.mulberry.market.Service.person_work.person_workServiceImpl;

import java.util.List;

public class person_workController {
    person_workService person_workService = new person_workServiceImpl();


    //根据员工编号查询工作状态(用于下面方法查看状态)
    public List<attenceinfo> worktimeByAttenceno(){
        return person_workService.worktimeByAttenceno();
    }
    //根据员工编号和上班状态查询一个集合
    public List<attenceinfo> useronduty(int userno,int onduty){
        attenceinfo attenceinfo = new attenceinfo();
        attenceinfo.setAttenceno(userno);
        attenceinfo.setOnduty(onduty);
        return person_workService.useronduty(attenceinfo);
    }
    //上班打卡添加记录
    public void gworkdaka(attenceinfo attenceinfo){
        person_workService.gworkdaka(attenceinfo);
    }




    //登陆时，将员工编号存入到考勤记录表中
    public void gworkByAttenceno(attenceinfo attenceinfo){
        person_workService.gworkByAttenceno(attenceinfo);
    }





    //根据员工编号查询工作状态(用于下面方法查看状态)
    public List<attenceinfo> worktimeByAttenceno1(){
        return person_workService.worktimeByAttenceno1();
    }
    //根据员工编号和上班状态查询一个集合
    public List<attenceinfo> useroffduty(int userno,int offduty){
        attenceinfo attenceinfo = new attenceinfo();
        attenceinfo.setAttenceno(userno);
        attenceinfo.setOffduty(offduty);
        return person_workService.useroffduty(attenceinfo);
    }
    //上班打卡添加记录
    public void lworkdaka(attenceinfo attenceinfo){
        person_workService.lworkdaka(attenceinfo);
    }
}
