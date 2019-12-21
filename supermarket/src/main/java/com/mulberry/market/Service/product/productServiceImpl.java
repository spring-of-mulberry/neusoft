package com.mulberry.market.Service.product;

import com.mulberry.market.Dao.product.productDao;
import com.mulberry.market.Dao.product.productDaoImpl;
import com.mulberry.market.Entity.goodsinfo;

import java.util.List;

public class productServiceImpl implements productService {
    productDao productDao = new productDaoImpl();
    //查询库存中所有数据
    public List<goodsinfo> all_goods(goodsinfo goodsinfo) {
        return productDao.all_goods(goodsinfo);
    }

    //通过商品条码查询商品
    public List<goodsinfo> in_goods(goodsinfo goodsinfo) {
        return productDao.in_goods(goodsinfo);
    }
    //添加入库
    public int insert_goods(goodsinfo goodsinfo) {
        return productDao.insert_goods(goodsinfo);
    }

    public int update_goods(goodsinfo goodsinfo) {
        return productDao.update_goods(goodsinfo);
    }

    public int delete_goods(goodsinfo goodsinfo) {
        return productDao.delete_goods(goodsinfo);
    }
    //缺货数据查看
    public List<goodsinfo> need_goods(goodsinfo goodsinfo) {
        return productDao.need_goods(goodsinfo);
    }

    public List<goodsinfo> need1_goods(goodsinfo goodsinfo) {
        return productDao.need1_goods(goodsinfo);
    }

    //根据商品类型查看商品
    public List<goodsinfo> type_goods(goodsinfo goodsinfo) {
        return productDao.type_goods(goodsinfo);
    }

    public List<goodsinfo> in_goods() {
        return productDao.in_goods();
    }

    public List<goodsinfo> out_goods() {
        return productDao.out_goods();
    }

    public int update_count(goodsinfo goodsinfo) {
        return productDao.update_count(goodsinfo);
    }
}
