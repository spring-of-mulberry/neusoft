package com.mulberry.demo01.service;

import com.mulberry.demo01.dao.demo01daoImpl;

public class demo01serviceImpl {
    demo01daoImpl loginDao;
    public void setLoginDao(demo01daoImpl loginDao) {
        this.loginDao = loginDao;
    }

    public void servicelogin(){
        loginDao.login();
    }
}
