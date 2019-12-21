package com.mulberry.demo01.dao;

public class demo02daoImpl {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public demo02daoImpl() {
    }

    public demo02daoImpl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public  void ss(){
        System.out.println("构造器注入方式demo02daoImpl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}');
    }
}
