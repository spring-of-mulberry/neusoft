package com.mulberry.thread;

public class runnable implements Runnable {
    @Override
    public void run() {
        for (int i=0;i<5;i++){
         //TThread.currentThread().getName()表示得到线程名称
            System.out.println("继承接口Runnable的线程2"+Thread.currentThread().getName());
        }
    }
}
