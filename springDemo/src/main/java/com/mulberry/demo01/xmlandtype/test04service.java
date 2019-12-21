package com.mulberry.demo01.xmlandtype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class test04service {
    @Autowired
    private test04dao test04dao;

    public void logservice(){
        test04dao.logdao();
    }
}
