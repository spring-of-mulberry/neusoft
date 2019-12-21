package com.mulberry.demo01.xmlandtype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("test04controller")
public class test04controller {
    @Autowired
    private test04service test04service;

    public void logcontroller(){
        test04service.logservice();
    }
}
