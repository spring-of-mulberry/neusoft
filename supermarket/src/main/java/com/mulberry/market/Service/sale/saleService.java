package com.mulberry.market.Service.sale;

import com.mulberry.market.Entity.salesdetial;

import java.util.List;

public interface saleService {
    //显示所有销售数据
    List<salesdetial> sale_all();
    //添加商品操作
    int add_sale(salesdetial salesdetial);
}
