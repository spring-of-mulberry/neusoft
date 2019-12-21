package com.mulberry.demo01.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo01serviceImplTest {

    @Test
    public void servicelogin() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        demo01serviceImpl demo01service = (demo01serviceImpl) context.getBean("loginService");
        demo01service.servicelogin();
    }
}