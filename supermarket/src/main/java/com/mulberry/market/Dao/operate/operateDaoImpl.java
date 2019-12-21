package com.mulberry.market.Dao.operate;

import com.mulberry.market.Comment.baseSql;
import com.mulberry.market.Entity.goodsoperater;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class operateDaoImpl extends baseSql implements operateDao {
    //添加商品上架
    public int add_operate(goodsoperater goodsoperater) {
        String sql = "insert into goodsoperater values(?,?,?,?,?,?,?)";
        Object[] objects = {
                goodsoperater.getGoodsoperaterid(),
                goodsoperater.getUserno(),
                goodsoperater.getBarcode(),
                goodsoperater.getGoodsname(),
                goodsoperater.getOnsaledate(),
                goodsoperater.getOnsaleprice(),
                goodsoperater.getState()
        };
        return this.iduDo(sql,objects,"sj");
    }

    public List<goodsoperater> out_operate(goodsoperater goodsoperater) {
        String sql = "select * from goodsoperater where state=1";
        Object[] objects = null;
        return this.selectDo(sql,objects,"");
    }

    public int down_operate(goodsoperater goodsoperater) {
        String sql = "update goodsoperater set state=? where barcode=?";
        Object[] objects = {
                goodsoperater.getState(),
                goodsoperater.getBarcode()
        };
        return this.iduDo(sql,objects,"");
    }

    public List<goodsoperater> see_all(goodsoperater goodsoperater) {
        String sql ="select * from goodsoperater";
        Object[] objects = null;
        return this.selectDo(sql,objects,"");
    }

    public List<goodsoperater> see_bycode(goodsoperater goodsoperater) {
        String sql = "select * from goodsoperater where barcode=?";
        Object[] objects = {goodsoperater.getBarcode()};
        return this.selectDo(sql,objects,"");
    }

    protected List<goodsoperater> resultToList(ResultSet rs) throws SQLException {
        List<goodsoperater> list = new ArrayList<goodsoperater>();
        while (rs.next()){
            goodsoperater goodsoperater = new goodsoperater();
            goodsoperater.setGoodsoperaterid(rs.getInt("goodsoperaterid"));
            goodsoperater.setUserno(rs.getInt("userno"));
            goodsoperater.setBarcode(rs.getString("barcode"));
            goodsoperater.setGoodsname(rs.getString("goodsname"));
            goodsoperater.setOnsaledate(rs.getDate("onsaledate"));
            goodsoperater.setOnsaleprice(rs.getDouble("onsaleprice"));
            goodsoperater.setState(rs.getInt("state"));
            list.add(goodsoperater);
        }
        return list;
    }
}
