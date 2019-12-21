package com.mulberry.market.Controller.purchases;

import com.mulberry.market.Entity.purchase;
import com.mulberry.market.Service.purchases.purchaseService;
import com.mulberry.market.Service.purchases.purchaseServiceImpl;

import java.util.List;

public class purchaseController {
    purchaseService purchaseService = new purchaseServiceImpl();
    //查询所有记录
    public List<purchase> select_purchaseall(){
        purchase p = new purchase();
        return purchaseService.select_purchaseall(p);
    }
    //查询单个记录
    public List<purchase> select_purchaseBycode(String code ){
        purchase p = new purchase();
        p.setGoodscode(code);
        return purchaseService.select_purchaseBycode(p);
    }
    //增加一条记录
    public int insert_purchase(purchase purchase){
        return purchaseService.insert_purchase(purchase);
    }
}
