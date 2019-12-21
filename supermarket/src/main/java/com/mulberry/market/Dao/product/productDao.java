package com.mulberry.market.Dao.product;

import com.mulberry.market.Entity.goodsinfo;

import java.util.List;

public interface productDao {
    //查询所有库存数据
    List<goodsinfo> all_goods(goodsinfo goodsinfo);
    //通过商品条码查询商品
    List<goodsinfo> in_goods(goodsinfo goodsinfo);
    //存入到库存表
    int insert_goods(goodsinfo goodsinfo);
    //条码修改库存数据
    int update_goods(goodsinfo goodsinfo);
    //条码删除数据
    int delete_goods(goodsinfo goodsinfo);
    //通过总数和报警数查看缺货记录
    List<goodsinfo> need_goods(goodsinfo goodsinfo);
    List<goodsinfo> need1_goods(goodsinfo goodsinfo);
    //根据商品类型查看商品
    List<goodsinfo> type_goods(goodsinfo goodsinfo);
    //查看库存数大于报警数的所有数据：上架
    List<goodsinfo> in_goods();
    //查看库存数小于报警数的所有数据：下架
    List<goodsinfo> out_goods();
    //修改库存表中的数量
    int update_count(goodsinfo goodsinfo);
}
