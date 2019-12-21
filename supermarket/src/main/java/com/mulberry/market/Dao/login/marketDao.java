package com.mulberry.market.Dao.login;

import com.mulberry.market.Entity.userinfo;

import java.util.List;

public interface marketDao {
    //用户登录模块
    List<userinfo> userlogin(userinfo uinfo);

}
