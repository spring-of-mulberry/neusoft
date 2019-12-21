package com.mulberry.demo01.xmlandtype;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class test04controllerTest {

    @Test
    public void logcontroller() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext04.xml");
        test04controller test04controller = (com.mulberry.demo01.xmlandtype.test04controller) context.getBean("test04controller");
        test04controller.logcontroller();
    }
}