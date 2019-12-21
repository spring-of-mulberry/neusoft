package com.mulberry.demo01.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;


@ContextConfiguration(classes = com.mulberry.demo01.config.ApplicationContext03.class)
public class demo03serviceImplTest {

    @Test
    public void servicelogin() {
        ApplicationContext context = new AnnotationConfigApplicationContext(com.mulberry.demo01.config.ApplicationContext03.class);
        demo03serviceImpl demo03service = (demo03serviceImpl) context.getBean("demo03service");
        demo03service.servicelogin03();
    }
}