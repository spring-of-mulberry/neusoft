package com.mulberry.market.Service.operate;

import com.mulberry.market.Dao.operate.operateDao;
import com.mulberry.market.Dao.operate.operateDaoImpl;
import com.mulberry.market.Entity.goodsoperater;

import java.util.List;

public class operateServiceImpl implements operateService {
    operateDao operateDao = new operateDaoImpl();
    //添加商品上架
    public int add_operate(goodsoperater goodsoperater) {
        return operateDao.add_operate(goodsoperater);
    }

    public List<goodsoperater> out_operate(goodsoperater goodsoperater) {
        return operateDao.out_operate(goodsoperater);
    }

    public int down_operate(goodsoperater goodsoperater) {
        return operateDao.down_operate(goodsoperater);
    }

    public List<goodsoperater> see_all(goodsoperater goodsoperater) {
        return operateDao.see_all(goodsoperater);
    }

    public List<goodsoperater> see_bycode(goodsoperater goodsoperater) {
        return operateDao.see_bycode(goodsoperater);
    }
}
