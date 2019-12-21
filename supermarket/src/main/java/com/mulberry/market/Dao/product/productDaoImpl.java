package com.mulberry.market.Dao.product;

import com.mulberry.market.Comment.baseSql;
import com.mulberry.market.Entity.goodsinfo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class productDaoImpl extends baseSql implements productDao {
    //查询所有库存记录
    public List<goodsinfo> all_goods(goodsinfo goodsinfo) {
        String sql = "select * from goodsinfo";
        Object[] objects = null;
        return this.selectDo(sql,objects,"查询库存中所有数据");
    }

    //根据商品条码查找数据
    public List<goodsinfo> in_goods(goodsinfo goodsinfo) {
        String sql = "select * from goodsinfo where goodscode=?";
        Object[] objects = {goodsinfo.getGoodscode()};
        return this.selectDo(sql,objects,"根据商品条码查找数据");
    }

    public int insert_goods(goodsinfo goodsinfo) {
        String sql = "insert into goodsinfo values(?,?,?,?,?,?,?,?)";
        Object[] objects ={
            goodsinfo.getGoodscode(),
            goodsinfo.getUserno(),
            goodsinfo.getGoodstype(),
            goodsinfo.getGoodssunit(),
            goodsinfo.getGoodsname(),
            goodsinfo.getGoodsalarm(),
            goodsinfo.getGoodsprice(),
            goodsinfo.getGoodstock()
        };
        return this.iduDo(sql,objects,"添加到入库表");
    }

    public int update_goods(goodsinfo goodsinfo) {
        String sql = "update goodsinfo set goodstype=? where goodscode=?";
        Object[] objects ={
                goodsinfo.getGoodstype(),
                goodsinfo.getGoodscode()
        };
        return this.iduDo(sql,objects,"通过条码修改库存数据");
    }

    public int delete_goods(goodsinfo goodsinfo) {
        String sql = "delete from goodsinfo where goodscode=?";
        Object[] objects ={
                goodsinfo.getGoodscode()
        };
        return this.iduDo(sql,objects,"通过条码删除库存数据");
    }
    //不缺货数据
    public List<goodsinfo> need1_goods(goodsinfo goodsinfo) {
        String sql = "select * from goodsinfo where goodstock>=goodsalarm and goodscode=?";
        Object[] objects ={
                goodsinfo.getGoodscode()
        };
        return this.selectDo(sql,objects,"chakanquehuoshuju");
    }
    //缺货数据查看
    public List<goodsinfo> need_goods(goodsinfo goodsinfo) {
        String sql = "select * from goodsinfo where goodstock<goodsalarm and goodscode=?";
        Object[] objects ={
                goodsinfo.getGoodscode()
        };
        return this.selectDo(sql,objects,"chakanquehuoshuju");
    }

    public List<goodsinfo> type_goods(goodsinfo goodsinfo) {
        String sql = "select * from goodsinfo where goodstype=?";
        Object[] objects = {goodsinfo.getGoodstype()};
        return this.selectDo(sql,objects,"通过商品类别查看数据");
    }

    public List<goodsinfo> in_goods() {
        String sql = "select * from goodsinfo where goodstock>=goodsalarm";
        Object[] objects = null;
        return this.selectDo(sql,objects,"查看上架商品");
    }

    public List<goodsinfo> out_goods() {
        String sql = "select * from goodsinfo where goodstock<goodsalarm";
        Object[] objects = null;
        return this.selectDo(sql,objects,"查看下架商品");
    }

    public int update_count(goodsinfo goodsinfo) {
        String sql = "update goodsinfo set goodstock=? where goodscode=?";
        Object[] objects = {
                goodsinfo.getGoodstock(),
                goodsinfo.getGoodscode()
        };
        return this.iduDo(sql,objects,"");
    }

    protected List<goodsinfo> resultToList(ResultSet rs) throws SQLException {
        List<goodsinfo> list = new ArrayList<goodsinfo>();
        while (rs.next()){
            goodsinfo goodsinfo = new goodsinfo();
            goodsinfo.setGoodscode(rs.getString("goodscode"));
            goodsinfo.setUserno(rs.getInt("userno"));
            goodsinfo.setGoodstype(rs.getInt("goodstype"));
            goodsinfo.setGoodssunit(rs.getString("goodssunit"));
            goodsinfo.setGoodsname(rs.getString("goodsname"));
            goodsinfo.setGoodsalarm(rs.getInt("goodsalarm"));
            goodsinfo.setGoodsprice(rs.getDouble("goodsprice"));
            goodsinfo.setGoodstock(rs.getInt("goodstock"));
            list.add(goodsinfo);
        }
        return list;
    }
}
