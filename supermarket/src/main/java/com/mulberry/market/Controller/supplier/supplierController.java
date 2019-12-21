package com.mulberry.market.Controller.supplier;

import com.mulberry.market.Dao.supplier.supplierDao;
import com.mulberry.market.Entity.supplier;
import com.mulberry.market.Service.supplier.supplierService;
import com.mulberry.market.Service.supplier.supplierServiceImpl;

import java.util.List;

public class supplierController {
    supplierService supplierService = new supplierServiceImpl();
    //查找所有的供应商
    public List<supplier> selectsupplier(supplier supplier) {
        return supplierService.selectsupplier(supplier);
    }
    //通过供应商号查找数据
    public List<supplier> selectsupplierByno(supplier supplier){
        return supplierService.selectsupplierByno(supplier);
    }

    public int insertsupplier(supplier supplier) {
        return supplierService.insertsupplier(supplier);
    }

    public int updatesupplier(supplier supplier) {
        return supplierService.updatesupplier(supplier);
    }

    public int deletesupplier(supplier supplier) {
        return supplierService.deletesupplier(supplier);
    }
}
