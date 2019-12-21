package com.mulberry.Threadworks.demo04;

public class Main {
    public static void main(String[] args) {
        Thread t = new Thread(new timer());
        t.start();
    }
}
