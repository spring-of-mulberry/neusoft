package com.mulberry.demo01.config;

import com.mulberry.demo01.dao.demo03daoImpl;
import com.mulberry.demo01.service.demo03serviceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationContext03 {

    @Bean(name = "demo03dao")
    public demo03daoImpl getUserDAOImpl(){
        return new demo03daoImpl();
    }

    @Bean(name = "demo03service")
    public demo03serviceImpl getUserService(){
        return new demo03serviceImpl();
    }
}
