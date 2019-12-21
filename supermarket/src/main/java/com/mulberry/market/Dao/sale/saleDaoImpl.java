package com.mulberry.market.Dao.sale;

import com.mulberry.market.Comment.baseSql;
import com.mulberry.market.Entity.salesdetial;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class saleDaoImpl extends baseSql implements saleDao {
    //显示所有销售信息
    public List<salesdetial> sale_all() {
        String sql = "select * from salesdetial";
        Object[] objects = null;
        return this.selectDo(sql,objects,"");
    }
    //添加商品操作
    public int add_sale(salesdetial salesdetial) {
        String sql = "insert into salesdetial values(?,?,?,?,?,?,?)";
        Object[] objects = {
                salesdetial.getDetialid(),
                salesdetial.getUserno(),
                salesdetial.getBarcode(),
                salesdetial.getCount(),
                salesdetial.getUnitprice(),
                salesdetial.getSumprice(),
                salesdetial.getSaledate()
        };
        return this.iduDo(sql,objects,"");
    }

    protected List<salesdetial> resultToList(ResultSet rs) throws SQLException {
        List<salesdetial> list = new ArrayList<salesdetial>();
        while (rs.next()){
            salesdetial salesdetial = new salesdetial();
            salesdetial.setDetialid(rs.getInt("detialid"));
            salesdetial.setUserno(rs.getInt("userno"));
            salesdetial.setBarcode(rs.getString("barcode"));
            salesdetial.setCount(rs.getInt("count"));
            salesdetial.setUnitprice(rs.getDouble("unitprice"));
            salesdetial.setSumprice(rs.getDouble("sumprice"));
            salesdetial.setSaledate(rs.getDate("saledate"));
            list.add(salesdetial);
        }
        return list;
    }
}
