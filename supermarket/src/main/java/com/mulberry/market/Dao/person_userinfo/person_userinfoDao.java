package com.mulberry.market.Dao.person_userinfo;

import com.mulberry.market.Entity.userinfo;

import java.util.List;

public interface person_userinfoDao {
    //查询收银员用户表
    List<userinfo> person_userinfo_select(userinfo userinfo);
    List<userinfo> person_userinfoAccount_select(userinfo userinfo);
    //增加收银员用户表
    int person_userinfo_insert(userinfo userinfo);
    //修改收银员用户表
    int person_userinfo_update(userinfo userinfo);
    //删除收银员用户表
    int person_userinfo_delete(userinfo userinfo);
}
