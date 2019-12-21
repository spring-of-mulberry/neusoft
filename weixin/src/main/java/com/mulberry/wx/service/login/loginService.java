package com.mulberry.wx.service.login;

import com.mulberry.wx.entity.admin;

import java.util.List;

public interface loginService {
    //通过用户名和密码查询用户信息
    List<admin> login(String username,String password);
    //通过用户名查询用户信息
    List<admin> login_user(String username);
}
