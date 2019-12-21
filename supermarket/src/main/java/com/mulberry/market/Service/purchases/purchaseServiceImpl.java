package com.mulberry.market.Service.purchases;

import com.mulberry.market.Dao.purchases.purchaseDao;
import com.mulberry.market.Dao.purchases.purchaseDaoImpl;
import com.mulberry.market.Entity.purchase;

import java.util.List;

public class purchaseServiceImpl implements purchaseService{
    purchaseDao purchaseDao = new purchaseDaoImpl();
    //查询总记录
    public List<purchase> select_purchaseall(purchase purchase) {
        return purchaseDao.select_purchaseall(purchase);
    }

    //查询单个记录
    public List<purchase> select_purchaseBycode(purchase purchase) {
        return purchaseDao.select_purchaseBycode(purchase);
    }

    //增加记录
    public int insert_purchase(purchase purchase) {
        return purchaseDao.insert_purchase(purchase);
    }



}
