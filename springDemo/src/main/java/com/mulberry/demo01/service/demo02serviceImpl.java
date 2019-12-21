package com.mulberry.demo01.service;

import com.mulberry.demo01.dao.demo02daoImpl;

public class demo02serviceImpl {
    private demo02daoImpl demo02dao;

    public demo02serviceImpl() {
    }


    public demo02serviceImpl(demo02daoImpl demo02dao) {
        this.demo02dao = demo02dao;
    }


    public  void test(){
        System.out.println("构造器注入调用demo02dao类");
        demo02dao.ss();
    }
}
