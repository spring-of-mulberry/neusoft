package com.mulberry.wx.dao.login;

import com.mulberry.wx.entity.admin;

import java.util.List;

public interface loginDao {
    //通过用户名和密码查询用户信息
    List<admin> login(String username, String password);
    //通过用户名查询用户信息
    List<admin> login_user(String username);
    //查询所有用户信息
}
