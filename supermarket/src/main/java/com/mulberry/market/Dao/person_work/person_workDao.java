package com.mulberry.market.Dao.person_work;

import com.mulberry.market.Entity.attenceinfo;

import java.util.List;

public interface person_workDao {
    //插入打卡操作
    int gworkByAttenceno(attenceinfo attenceinfo);



    //查询编号是否存在
    List<attenceinfo> worktimeByAttenceno();
    //根据员工编号和上班状态查询一个集合
    List<attenceinfo> useronduty(attenceinfo attenceinfo);

    //上班打卡
    int gworkdaka(attenceinfo attenceinfo);



    //查询编号是否存在
    List<attenceinfo> worktimeByAttenceno1();
    //根据员工编号和上班状态查询一个集合
    List<attenceinfo> useroffduty(attenceinfo attenceinfo);

    //上班打卡
    int lworkdaka(attenceinfo attenceinfo);
}
