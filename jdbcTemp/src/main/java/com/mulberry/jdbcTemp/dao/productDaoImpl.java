package com.mulberry.jdbcTemp.dao;

import com.mulberry.jdbcTemp.entity.product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class productDaoImpl implements productDao {
    //通过jdbcTemplate来对数据进行增删改查
    JdbcTemplate jdbcTemplate;

    @Override
    public List<product> select_all() {
        String sql = "select * from product";
        RowMapper<product> rowMapper = new BeanPropertyRowMapper<>(product.class);
        return jdbcTemplate.query(sql,rowMapper);
    }

    @Override
    public product selectByid(int id) {
        String sql ="select * from product where id=?";
        RowMapper<product> rowMapper = new BeanPropertyRowMapper<>(product.class);
        return jdbcTemplate.queryForObject(sql,rowMapper,id);
    }

    @Override
    public int updateByid(product product) {
        String sql = "update product set pname=?,pprice=?,pcount=?,pimage=?,pdetails=?,pfenid=?,pfenname=? where id=?";
        return jdbcTemplate.update(sql,product.getPname(),product.getPprice(),product.getPcount(),product.getPimage(),product.getPdetails(),product.getPfenid(),product.getPfenname(),product.getId());
    }

    @Override
    public int deleteByid(int id) {
        String sql = "delete from product where id=?";
        return jdbcTemplate.update(sql,id);
    }

    @Override
    public int insert(product product) {
        String sql = "insert into product value(?,?,?,?,?,?,?,?)";
        return jdbcTemplate.update(sql,product.getId(),product.getPname(),product.getPprice(),product.getPcount(),product.getPimage(),product.getPdetails(),product.getPfenid(),product.getPfenname());
    }
}
