package com.mulberry.object.product;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.show("可乐",2.5);
        product.show("鼠标",50);
        product.name="外部赋值";
        product.price=33;
        product.show(product.name,product.price);
    }
}
