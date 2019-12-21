package com.mulberry.wx.dao.login;

import com.mulberry.wx.comm.baseSql;
import com.mulberry.wx.entity.admin;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class loginDaoImpl extends baseSql implements loginDao {
    @Override
    public List<admin> login(String username, String password) {
        String sql = "select * from admin where username=? and password=?";
        Object[] objects = {username,password};
        return selectDo(sql,objects,"判断登录账号和密码");
    }

    @Override
    public List<admin> login_user(String username) {
        String sql = "select * from admin where username=?";
        Object[] objects = {username};
        return selectDo(sql,objects,"通过用户名查询用户信息");
    }

    @Override
    protected List<admin> resultToList(ResultSet rs) throws SQLException {
        List<admin> list = new ArrayList<>();
        while (rs.next()){
            admin admin = new admin();
            admin.setUsername(rs.getString("username"));
            admin.setPassword(rs.getString("password"));
            list.add(admin);
        }
        return list;
    }
}
