package com.mulberry.market.Controller.person_userinfo;

import com.mulberry.market.Entity.userinfo;
import com.mulberry.market.Service.person_userinfo.person_userinfoService;
import com.mulberry.market.Service.person_userinfo.person_userinfoServiceImpl;

import java.util.List;

public class person_userinfoController {
    person_userinfoService person_userinfoService = new person_userinfoServiceImpl();
    //查询
    public List<userinfo> person_userinfo_select(int admin){
        userinfo userinfo = new userinfo();
        userinfo.setIsadmin(admin);
        return person_userinfoService.person_userinfo_select(userinfo);
    }
    //管理员通过账户查找userinfo表
    public List<userinfo> person_userinfoAccount_select(String account){
        userinfo userinfo = new userinfo();
        userinfo.setAccount(account);
        return person_userinfoService.person_userinfoAccount_select(userinfo);
    }
    //增加
    public void person_userinfo_insert(userinfo userinfo){

        person_userinfoService.person_userinfo_insert(userinfo);
    }
    //修改
    public void person_userinfo_update(userinfo userinfo){
        person_userinfoService.person_userinfo_update(userinfo);
    }
    //删除
    public void person_userinfo_delete(String account){
        userinfo userinfo = new userinfo();
        userinfo.setAccount(account);
        person_userinfoService.person_userinfo_delete(userinfo);
    }
}
