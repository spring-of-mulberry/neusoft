package com.mulberry.market.Controller.product;

import com.mulberry.market.Entity.goodsinfo;
import com.mulberry.market.Service.product.productService;
import com.mulberry.market.Service.product.productServiceImpl;

import java.util.List;

public class productController {
    productService productService = new productServiceImpl();
    //查询所有库存数据
    public List<goodsinfo> all_goods(){
        goodsinfo g1 = null;
        return productService.all_goods(g1);
    }
    //通过商品条码查询商品
    public List<goodsinfo> in_goods(String code ){
        goodsinfo goodsinfo = new goodsinfo();
        goodsinfo.setGoodscode(code);
        return productService.in_goods(goodsinfo);
    }
    //添加入库
    public int insert_goods(goodsinfo goodsinfo) {
        return productService.insert_goods(goodsinfo);
    }
    //通过条码修改商品类别
    public int update_goods(int type,String code){
        goodsinfo goodsinfo1 = new goodsinfo();
        goodsinfo1.setGoodstype(type);
        goodsinfo1.setGoodscode(code);
        return productService.update_goods(goodsinfo1);
    }
    //通过条码删除库存数据
    public int delete_goods(String type){
        goodsinfo goodsinfo2 = new goodsinfo();
        goodsinfo2.setGoodscode(type);
        return productService.delete_goods(goodsinfo2);
    }
    //通过库存总数和报警数和商品条码查看缺货记录
    public List<goodsinfo> need_goods(String code){
        goodsinfo goodsinfo3 = new goodsinfo();
        goodsinfo3.setGoodscode(code);
        return productService.need_goods(goodsinfo3);
    }
    //通过库存总数和报警数和商品条码查看缺货记录
    public List<goodsinfo> need1_goods(String code){
        goodsinfo goodsinfo3 = new goodsinfo();
        goodsinfo3.setGoodscode(code);
        return productService.need1_goods(goodsinfo3);
    }
    //根据商品类别查看商品
    public List<goodsinfo> type_goods(int type){
        goodsinfo goodsinfo4 = new goodsinfo();
        goodsinfo4.setGoodstype(type);
        return productService.type_goods(goodsinfo4);
    }
    //查看库存数大于报警数的所有数据：上架
    public List<goodsinfo> in_goods(){
        return productService.in_goods();
    }
    //查看库存数小于报警数的所有数据：下架
    public List<goodsinfo> out_goods(){
        return productService.out_goods();
    }
    //修改库存表中的数量
    public int update_count(String code,int count){
        goodsinfo goodsinfo111 = new goodsinfo();
        goodsinfo111.setGoodscode(code);
        goodsinfo111.setGoodstock(count);
        return productService.update_count(goodsinfo111);
    }
}
