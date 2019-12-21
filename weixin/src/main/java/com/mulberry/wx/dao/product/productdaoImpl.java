package com.mulberry.wx.dao.product;

import com.mulberry.wx.comm.baseSql;
import com.mulberry.wx.dao.product.productdao;
import com.mulberry.wx.entity.product;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class productdaoImpl extends baseSql implements productdao {
    @Override
    public List<product> select_product() {
        String sql = "select * from product";
        return selectDo(sql,null,"查询出所有的商品");
    }

    @Override
    public List<product> select_productByid(product product) {
        String sql = "select * from product where id=?";
        Object[] objects = {
                product.getId()
        };
        return selectDo(sql,objects,"根据商品id查询商品信息");
    }

    @Override
    public int add_product(product product) {
        String sql = "insert into product values(?,?,?,?,?,?,?,?)";
        Object[] objects = {
                product.getId(),
                product.getPname(),
                product.getPprice(),
                product.getPcount(),
                product.getPimage(),
                product.getPdetails(),
                product.getPfenid(),
                product.getPfenname()
        };
        return iduDo(sql,objects,"添加商品");
    }

    @Override
    public int update_product(product product) {
        String sql = "update product set pname=?,pprice=?,pcount=?,pimage=?,pdetails=?,pfenid=?,pfenname=? where id=?";
        Object[] objects = {

                product.getPname(),
                product.getPprice(),
                product.getPcount(),
                product.getPimage(),
                product.getPdetails(),
                product.getPfenid(),
                product.getPfenname(),
                product.getId()
        };
        return iduDo(sql,objects,"根据商品id修改数据");
    }

    @Override
    public int delete_product(product product ) {
        String sql = "delete from product where id=?";
        Object[] objects = {product.getId()};
        return iduDo(sql,objects,"根据id删除商品");
    }

    @Override
    protected List<product> resultToList(ResultSet rs) throws SQLException {
        List<product> list = new ArrayList<>();
        while (rs.next()){
            product p  = new product();
            p.setId(rs.getInt("id"));
            p.setPname(rs.getString("pname"));
            p.setPprice(rs.getFloat("pprice"));
            p.setPcount(rs.getInt("pcount"));
            p.setPimage(rs.getString("pimage"));
            p.setPdetails(rs.getString("pdetails"));
            p.setPfenid(rs.getInt("pfenid"));
            p.setPfenname(rs.getString("pfenname"));
            list.add(p);
        }
        return list;
    }
}
