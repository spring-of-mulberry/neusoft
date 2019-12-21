package com.mulberry.market.Service.supplier;

import com.mulberry.market.Dao.supplier.supplierDao;
import com.mulberry.market.Dao.supplier.supplierDaoImpl;
import com.mulberry.market.Entity.supplier;

import java.util.List;

public class supplierServiceImpl implements supplierService {
    supplierDao supplierDao = new supplierDaoImpl();
    public List<supplier> selectsupplier(supplier supplier) {
        return supplierDao.selectsupplier(supplier);
    }

    public List<supplier> selectsupplierByno(supplier supplier) {
        return supplierDao.selectsupplierByno(supplier);
    }

    public int insertsupplier(supplier supplier) {
        return supplierDao.insertsupplier(supplier);
    }

    public int updatesupplier(supplier supplier) {
        return supplierDao.updatesupplier(supplier);
    }

    public int deletesupplier(supplier supplier) {
        return supplierDao.deletesupplier(supplier);
    }
}
