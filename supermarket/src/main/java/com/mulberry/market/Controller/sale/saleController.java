package com.mulberry.market.Controller.sale;

import com.mulberry.market.Entity.salesdetial;
import com.mulberry.market.Service.sale.saleService;
import com.mulberry.market.Service.sale.saleServiceImpl;

import java.util.List;

public class saleController {
    saleService saleService = new saleServiceImpl();
    //查看所有明细表数据
    public List<salesdetial> sale_all(){
        return saleService.sale_all();
    }
    //向明细表中增加数据
    public int add_sale(salesdetial salesdetial){
        return saleService.add_sale(salesdetial);
    }
}
