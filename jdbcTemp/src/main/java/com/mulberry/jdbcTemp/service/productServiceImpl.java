package com.mulberry.jdbcTemp.service;

import com.mulberry.jdbcTemp.dao.productDao;
import com.mulberry.jdbcTemp.dao.productDaoImpl;
import com.mulberry.jdbcTemp.entity.product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class productServiceImpl implements productService {
    @Autowired
    private productDao productDao;

    @Override
    public List<product> select_all() {
        return productDao.select_all();
    }

    @Override
    public product selectByid(int id) {
        return productDao.selectByid(id);
    }

    @Override
    public int updateByid(product product) {
        return productDao.updateByid(product);
    }

    @Override
    public int deleteByid(int id) {
        return productDao.deleteByid(id);
    }

    @Override
    public int insert(product product) {
        return productDao.insert(product);
    }
}
