package com.mul.main;

import com.mul.entity.Price;
import com.mul.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class getProduct {
    public static List<Product> getProduct(){
        List<Product> products = new ArrayList<>();
        Product product = new Product();
//        ,0,null,null
        Product product1 = new Product(1001,"华为note 2",2,3299,true);
        Product product2 = new Product(1002,"华为P30 pro",2,6488,true);
        Product product3 = new Product(1003,"VIVOxplay5",1,3788,true);
        Product product4 = new Product(1004,"iphone X",3,6899,true);
        Product product5 = new Product(1005,"OPPO next",1,3400,true);
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
//        product = operatePrice.operate();
//        for (Product p :products
//             ) {
//            if (product.getPid()!=p.getPid()){
//                continue;
//            }else{
//                product = p;
//            }
//        }
        return products;
    }
}
