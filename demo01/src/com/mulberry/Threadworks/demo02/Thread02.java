package com.mulberry.Threadworks.demo02;

public class Thread02 implements Runnable {
    @Override
    public void run() {
        for (int i = 1001; i <=2000 ; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i);
            }
        }
    }
}
