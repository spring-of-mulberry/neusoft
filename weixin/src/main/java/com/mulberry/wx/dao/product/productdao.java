package com.mulberry.wx.dao.product;

import com.mulberry.wx.entity.product;

import java.util.List;

public interface productdao {
    //查询商品信息
    List<product> select_product();
    //根据商品id查询商品信息
    List<product> select_productByid(product product);
    //添加商品信息
    int add_product(product product);
    //修改商品信息
    int update_product(product product);
    //删除商品信息
    int delete_product(product product);
}
