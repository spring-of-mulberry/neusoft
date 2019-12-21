package com.mulberry.market.Controller.login;

import com.mulberry.market.Entity.userinfo;
import com.mulberry.market.Service.login.marketService;
import com.mulberry.market.Service.login.marketServiceImpl;

import java.util.List;

public class marketController {
    private marketService service = new marketServiceImpl();
    //登录操作
    public List<userinfo> userlogin(String username,String pwd){
        userinfo uinfo = new userinfo();
        //测试
        uinfo.setAccount(username);
        uinfo.setPwd(pwd);
       List<userinfo> user = service.userlogin(uinfo);
        return user;
    }
}
