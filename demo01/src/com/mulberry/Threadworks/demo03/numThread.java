package com.mulberry.Threadworks.demo03;

public class numThread implements Runnable{
    @Override
    public  void run() {
        synchronized (this) {
            for (int i = 0; i < 200; i++) {
                System.out.println(Thread.currentThread().getName() + "正在运行");
            }
        }
    }
}
