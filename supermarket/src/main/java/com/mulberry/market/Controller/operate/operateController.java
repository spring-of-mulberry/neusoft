package com.mulberry.market.Controller.operate;

import com.mulberry.market.Entity.goodsoperater;
import com.mulberry.market.Service.operate.operateService;
import com.mulberry.market.Service.operate.operateServiceImpl;

import java.util.List;

public class operateController {
    operateService operateService = new operateServiceImpl();
    //添加商品上架
    public int add_operate(goodsoperater goodsoperater){
        return operateService.add_operate(goodsoperater);
    }
    //查询j克下架商品
    public List<goodsoperater> out_operate(){
        goodsoperater goodsoperater = null;
        return operateService.out_operate(goodsoperater);
    }
    //通过商品条码调整为下架
    public int down_operate(String code){
        int i = 0;//下架状态
        goodsoperater goodsoperater = new goodsoperater();
        goodsoperater.setState(i);
        goodsoperater.setBarcode(code);
        return operateService.down_operate(goodsoperater);
    }
    //查看上下架商品表
    public List<goodsoperater> see_all(){
        goodsoperater goodsoperater = null;
        return operateService.see_all(goodsoperater);
    }
    //根据条码查询数据
    public List<goodsoperater> see_bycode(String code){
        goodsoperater goodsoperater = new goodsoperater();
        goodsoperater.setBarcode(code);
        return operateService.see_bycode(goodsoperater);
    }

}
