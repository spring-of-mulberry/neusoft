package com.mulberry.market.Service.person_userinfo;

import com.mulberry.market.Entity.userinfo;

import java.util.List;

public interface person_userinfoService {
    //查询
    List<userinfo> person_userinfo_select(userinfo userinfo);
    List<userinfo> person_userinfoAccount_select(userinfo userinfo);
    //增加
    int person_userinfo_insert(userinfo userinfo);
    //修改
    int person_userinfo_update(userinfo userinfo);
    //删除
    int person_userinfo_delete(userinfo userinfo);
}
