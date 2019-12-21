package com.mulberry.market.Dao.supplier;

import com.mulberry.market.Comment.baseSql;
import com.mulberry.market.Entity.supplier;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class supplierDaoImpl extends baseSql implements supplierDao{
    public List<supplier> selectsupplier(supplier supplier) {
        String sql = "select * from supplier";
        Object[] objects = null;
        return this.selectDo(sql,objects,"chaxunyewu");
    }

    public List<supplier> selectsupplierByno(supplier supplier) {
        String sql = "select * from supplier where supplierno=?";
        Object[] objects = {supplier.getSupplierno()};
        return this.selectDo(sql,objects,"tongguogongingshanghaochakanyewu");
    }

    public int insertsupplier(supplier supplier) {
        String sql = "insert into supplier values(?,?,?,?,?,?)";
        Object[] objects = {
                supplier.getSupplierno(),
                supplier.getSuppliername(),
                supplier.getSuppliermanager(),
                supplier.getSuppliercontact(),
                supplier.getSuppliercontactphone(),
                supplier.getSupplieraddress()
        };
        return this.iduDo(sql,objects,"zengjiayewu");
    }

    public int updatesupplier(supplier supplier) {
        String sql = "update supplier set suppliermanager=?,suppliercontact=?,suppliercontactphone=? where supplierno=?";
        Object[] objects = {
                supplier.getSuppliermanager(),
                supplier.getSuppliercontact(),
                supplier.getSuppliercontactphone(),
                supplier.getSupplierno()
        };
        return this.iduDo(sql,objects,"xiugaiyewu");
    }

    public int deletesupplier(supplier supplier) {
        String sql = "delete from supplier where supplierno=?";
        Object[] objects = {supplier.getSupplierno()};
        return this.iduDo(sql,objects,"shanchuyewu");
    }

    protected List<supplier> resultToList(ResultSet rs) throws SQLException {
        List<supplier> list = new ArrayList<supplier>();
        while (rs.next()){
            supplier supplier = new supplier();
            supplier.setSupplierno(rs.getInt("supplierno"));
            supplier.setSuppliername(rs.getString("suppliername"));
            supplier.setSuppliermanager(rs.getString("suppliermanager"));
            supplier.setSuppliercontact(rs.getString("suppliercontact"));
            supplier.setSuppliercontactphone(rs.getLong("suppliercontactphone"));
            supplier.setSupplieraddress(rs.getString("supplieraddress"));
            list.add(supplier);
        }
        return list;
    }
}
