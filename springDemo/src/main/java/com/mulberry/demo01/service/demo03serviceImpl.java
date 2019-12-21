package com.mulberry.demo01.service;

import com.mulberry.demo01.dao.demo03daoImpl;
import org.springframework.beans.factory.annotation.Autowired;

public class demo03serviceImpl {
    @Autowired
     private demo03daoImpl loginDao03;


    public void servicelogin03(){
        loginDao03.login();
    }
}
