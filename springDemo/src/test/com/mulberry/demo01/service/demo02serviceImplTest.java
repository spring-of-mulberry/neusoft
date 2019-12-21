package com.mulberry.demo01.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

import static org.junit.Assert.*;

public class demo02serviceImplTest {

    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext02.xml");
        demo02serviceImpl demo02service = (demo02serviceImpl) context.getBean("demo02service");
        demo02service.test();
    }
}