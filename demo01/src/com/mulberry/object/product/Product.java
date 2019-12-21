package com.mulberry.object.product;

public class Product {
    public String name;
    public double price;

    public void show(String name,double price) {
        System.out.println(name+":"+price+"元");
    }
}
