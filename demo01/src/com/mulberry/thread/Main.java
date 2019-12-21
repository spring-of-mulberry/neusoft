package com.mulberry.thread;

public class Main {
    public static void main(String[] args) {
        //Thread线程
       thread t1 = new thread();
        t1.start();
        //Runnable线程
        Thread t2 = new Thread(new runnable());
        t2.start();
        //主线程
        System.out.println("主线程名称："+Thread.currentThread().getName());

    }
}
