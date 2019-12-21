package com.mulberry.market.Dao.supplier;

import com.mulberry.market.Entity.supplier;

import java.util.List;

public interface supplierDao {
    //查看
    List<supplier> selectsupplier(supplier supplier);
    //通过供应商号查看数据
    List<supplier> selectsupplierByno(supplier supplier);
    //增加
    int insertsupplier(supplier supplier);
    //修改
    int updatesupplier(supplier supplier);
    //删除
    int deletesupplier(supplier supplier);
}
