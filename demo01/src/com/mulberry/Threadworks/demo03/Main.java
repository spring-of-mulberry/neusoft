package com.mulberry.Threadworks.demo03;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new numThread());
        Thread t2 = new Thread(new numThread());
        t1.setPriority(10);
        t2.setPriority(6);
        t1.setName("线程1");
        t2.setName("线程2");
        t1.start();
        t2.start();
    }
}
