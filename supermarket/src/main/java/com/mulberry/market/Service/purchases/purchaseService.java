package com.mulberry.market.Service.purchases;

import com.mulberry.market.Entity.purchase;

import java.util.List;

public interface purchaseService {
    //查询总记录
    List<purchase> select_purchaseall(purchase purchase);
    //查询单个记录
    List<purchase> select_purchaseBycode(purchase purchase);
    //增加记录
    int insert_purchase(purchase purchase);
}
