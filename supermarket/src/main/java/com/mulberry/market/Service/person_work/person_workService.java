package com.mulberry.market.Service.person_work;

import com.mulberry.market.Entity.attenceinfo;

import java.util.List;

public interface person_workService {
    //增加
    int gworkByAttenceno(attenceinfo attenceinfo);



    //查询
    List<attenceinfo> worktimeByAttenceno();
    //根据员工编号和上班状态查询一个集合
    List<attenceinfo> useronduty(attenceinfo attenceinfo);
    //上班打卡
    int gworkdaka(attenceinfo attenceinfo);




//下班
    //查询
    List<attenceinfo> worktimeByAttenceno1();
    //根据员工编号和上班状态查询一个集合
    List<attenceinfo> useroffduty(attenceinfo attenceinfo);
    //上班打卡
    int lworkdaka(attenceinfo attenceinfo);

}
