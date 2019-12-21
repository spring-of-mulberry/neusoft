package com.mulberry.Threadworks.demo01;

public class Main {
    public static void main(String[] args) {
        Thread01 t1 = new Thread01();
        Thread02 t2 = new Thread02();
        Thread03 t3 = new Thread03();
        t1.setPriority(3);
        t2.setPriority(2);
        t3.setPriority(1);
        t1.start();
        t2.start();
        t3.start();

    }
}
