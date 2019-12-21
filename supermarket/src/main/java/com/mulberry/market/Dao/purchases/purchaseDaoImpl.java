package com.mulberry.market.Dao.purchases;

import com.mulberry.market.Comment.baseSql;
import com.mulberry.market.Entity.purchase;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class purchaseDaoImpl extends baseSql implements purchaseDao {
    //查询总记录
    public List<purchase> select_purchaseall(purchase purchase) {
        String sql = "select * from purchase";
        Object[] objects = null;
        return this.selectDo(sql,objects,"查询总进货记录");
    }

    //查询单个记录
    public List<purchase> select_purchaseBycode(purchase purchase) {
        String sql = "select * from purchase where goodscode=?";
        Object[] objects = {purchase.getGoodscode()};
        return this.selectDo(sql,objects,"根据商品条码查询进货数据");
    }

    //增加记录
    public int insert_purchase(purchase purchase) {
        String sql = "insert into purchase values(?,?,?,?,?,?,?)";
        Object[] objects = {
                purchase.getPurchaseid(),
                purchase.getGoodscode(),
                purchase.getGoodsname(),
                purchase.getPurchasetime(),
                purchase.getPurchaseocunt(),
                purchase.getPurchaseprice(),
                purchase.getSupplierno()
        };
        return this.iduDo(sql,objects,"增加一条记录");
    }

    protected List<purchase> resultToList(ResultSet rs) throws SQLException {
        List<purchase> list = new ArrayList<purchase>();
        while (rs.next()){
            purchase purchase = new purchase();
            purchase.setPurchaseid(rs.getInt("purchaseid"));
            purchase.setGoodscode(rs.getString("goodscode"));
            purchase.setGoodsname(rs.getString("goodsname"));
            purchase.setPurchasetime(rs.getDate("purchasetime"));
            purchase.setPurchaseocunt(rs.getInt("purchasecount"));
            purchase.setPurchaseprice(rs.getDouble("purchaseprice"));
            purchase.setSupplierno(rs.getInt("supplierno"));
            list.add(purchase);
        }
        return list;
    }



}
