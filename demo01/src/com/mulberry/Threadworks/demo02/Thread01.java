package com.mulberry.Threadworks.demo02;

public class Thread01 implements Runnable {
    @Override
    public void run() {
        for (int i = 2; i <=1000 ; i++) {
            boolean flag = true;
            for (int j = 2; j <i ; j++) {
                if (i%j==0){
                    flag =false;
                    break;
                }
            }
            if (flag){
                System.out.println(i);
            }
        }
    }
}
