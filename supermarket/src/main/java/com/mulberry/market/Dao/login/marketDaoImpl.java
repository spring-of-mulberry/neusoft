package com.mulberry.market.Dao.login;

import com.mulberry.market.Comment.baseSql;
import com.mulberry.market.Dao.login.marketDao;
import com.mulberry.market.Entity.userinfo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class marketDaoImpl extends baseSql implements marketDao {
    //登录操作
    public List<userinfo> userlogin(userinfo uinfo) {
        String sql = "select * from userinfo where account=? and pwd=?";
        Object[] objects = {uinfo.getAccount(),uinfo.getPwd()};
        return this.selectDo(sql,objects,"查询用户信息") ;
    }
    protected List<userinfo> resultToList(ResultSet rs) throws SQLException {
        List<userinfo> list = new ArrayList<userinfo>();
        while (rs.next()){
            userinfo user = new userinfo();
            user.setUserno(rs.getInt("userno"));
            user.setUname(rs.getString("uname"));
            user.setPhone(rs.getString("phone"));
            user.setAccount(rs.getString("account"));
            user.setPwd(rs.getString("pwd"));
            user.setIsadmin(rs.getInt("isadmin"));
            user.setIsenable(rs.getInt("isenable"));
            list.add(user);
        }
        return list;
    }

}
