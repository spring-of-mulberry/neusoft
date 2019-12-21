package com.mulberry.wx.service.login;

import com.mulberry.wx.dao.login.loginDao;
import com.mulberry.wx.dao.login.loginDaoImpl;
import com.mulberry.wx.entity.admin;

import java.util.List;

public class loginServiceImpl implements loginService {
    loginDao loginDao = new loginDaoImpl();
    @Override
    public List<admin> login(String username, String password) {
        return loginDao.login(username,password);
    }

    @Override
    public List<admin> login_user(String username) {
        return loginDao.login_user(username);

    }



}
