package com.mulberry.market.Dao.operate;

import com.mulberry.market.Entity.goodsoperater;

import java.util.List;

public interface operateDao {
    //添加商品上架
    int add_operate(goodsoperater goodsoperater);
    List<goodsoperater> out_operate(goodsoperater goodsoperater);
    //xiajia
    int down_operate(goodsoperater goodsoperater);
    List<goodsoperater> see_all(goodsoperater goodsoperater);
    List<goodsoperater> see_bycode(goodsoperater goodsoperater);
}
