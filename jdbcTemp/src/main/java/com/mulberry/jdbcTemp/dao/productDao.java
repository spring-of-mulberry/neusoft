package com.mulberry.jdbcTemp.dao;

import com.mulberry.jdbcTemp.entity.product;

import java.util.List;

public interface productDao {
    //查询所有商品信息
    List<product> select_all();
    //根据id查询单个商品信息
    product selectByid(int id);
    //根据id修改商品信息
    int updateByid(product product);
    //根据id删除商品信息
    int deleteByid(int id);
    //增加一个商品信息
    int insert(product product);
}
