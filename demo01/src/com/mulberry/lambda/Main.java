package com.mulberry.lambda;

public class Main {
    public static void main(String[] args) {
        Main.myTest((a,b)->{
            System.out.println(a);
            System.out.println("方法中实现函数接口");
            System.out.println(b);
        } );
        System.out.println("==============");
        //直接实现函数接口lambda
        Iface iface = (a,b)-> {System.out.println("直接实现函数接口");
            System.out.println(a);
            System.out.println(b);
        };
        iface.say(10,20);
        //内部类实现接口

    }
    public static void myTest(Iface iface){
        System.out.println("ceshi1");
        iface.say(1,2);
        System.out.println("ceshi2");
    }
}
