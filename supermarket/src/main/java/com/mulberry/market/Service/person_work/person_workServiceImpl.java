package com.mulberry.market.Service.person_work;

import com.mulberry.market.Dao.person_work.person_workDao;
import com.mulberry.market.Dao.person_work.person_workDaoImpl;
import com.mulberry.market.Entity.attenceinfo;

import java.util.List;

public class person_workServiceImpl implements person_workService {
    person_workDao person_workDao = new person_workDaoImpl();
    //增加
    public int gworkByAttenceno(attenceinfo attenceinfo) {
        return person_workDao.gworkByAttenceno(attenceinfo);
    }



//    上班
    //根据员工编号查询工作状态(用于下面方法查看状态)
    public List<attenceinfo> worktimeByAttenceno() {
        return person_workDao.worktimeByAttenceno();
    }
    //根据员工编号和上班状态查询一个集合
    public List<attenceinfo> useronduty(attenceinfo attenceinfo) {
        return person_workDao.useronduty(attenceinfo);
    }
    //上班打卡
    public int gworkdaka(attenceinfo attenceinfo) {
        return person_workDao.gworkdaka(attenceinfo);
    }



//    下班
    //根据员工编号查询工作状态(用于下面方法查看状态)
    public List<attenceinfo> worktimeByAttenceno1() {
        return person_workDao.worktimeByAttenceno1();
    }
    //根据员工编号和上班状态查询一个集合
    public List<attenceinfo> useroffduty(attenceinfo attenceinfo) {
        return person_workDao.useroffduty(attenceinfo);
    }
    //上班打卡
    public int lworkdaka(attenceinfo attenceinfo) {
        return person_workDao.lworkdaka(attenceinfo);
    }
}
