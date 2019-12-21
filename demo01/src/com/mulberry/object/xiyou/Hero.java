package com.mulberry.object.xiyou;

public class Hero {
    public static void main(String[] args) {

        Obj obj1 = new Obj("孙悟空","金箍棒","五颗星","五颗星");
        Obj obj2 = new Obj("唐僧","无","零颗星","五颗星");
        Obj obj3 = new Obj("猪八戒","耙子","四颗星","两颗星");
        Obj obj4 = new Obj("沙僧","月牙铲","三颗星","四颗星");
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        System.out.println(obj3.toString());
        System.out.println(obj4.toString());
    }
}
