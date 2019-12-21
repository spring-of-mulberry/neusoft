package com.mulberry.wx.service.product;

import com.mulberry.wx.dao.product.productdao;
import com.mulberry.wx.dao.product.productdaoImpl;
import com.mulberry.wx.entity.product;
import com.mulberry.wx.service.product.productService;

import java.util.List;

public class productServiceImpl implements productService {
    productdao productdao = new productdaoImpl();
    @Override
    public List<product> select_product() {
        return productdao.select_product();
    }

    @Override
    public List<product> select_productByid(int id) {
        product product = new product();
        product.setId(id);
        return productdao.select_productByid(product);
    }

    @Override
    public int add_product(product product) {
        return productdao.add_product(product);
    }

    @Override
    public int update_product(product product) {
        return productdao.update_product(product);
    }

    @Override
    public int delete_product(int id) {
        product product = new product();
        product.setId(id);
        return productdao.delete_product(product);
    }
}
