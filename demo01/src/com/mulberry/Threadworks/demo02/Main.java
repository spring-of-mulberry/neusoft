package com.mulberry.Threadworks.demo02;

import com.mulberry.Threadworks.demo01.Thread01;
import com.mulberry.Threadworks.demo01.Thread02;
import com.mulberry.Threadworks.demo01.Thread03;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Thread01());
        Thread t2 = new Thread(new Thread02());
        Thread t3 = new Thread(new Thread03());
        t1.setPriority(3);
        t2.setPriority(2);
        t3.setPriority(1);
        t1.start();
        t2.start();
        t3.start();
    }
}
