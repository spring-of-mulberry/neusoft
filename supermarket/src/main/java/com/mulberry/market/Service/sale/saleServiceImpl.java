package com.mulberry.market.Service.sale;

import com.mulberry.market.Dao.sale.saleDao;
import com.mulberry.market.Dao.sale.saleDaoImpl;
import com.mulberry.market.Entity.salesdetial;

import java.util.List;

public class saleServiceImpl implements saleService {
    saleDao saleDao = new saleDaoImpl();
    public List<salesdetial> sale_all() {
        return saleDao.sale_all();
    }

    public int add_sale(salesdetial salesdetial) {
        return saleDao.add_sale(salesdetial);
    }
}
