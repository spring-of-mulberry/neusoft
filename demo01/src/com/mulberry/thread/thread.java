package com.mulberry.thread;

public class thread extends Thread {
    @Override
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println("继承Thread的线程1"+this.getName());
        }
    }
}
