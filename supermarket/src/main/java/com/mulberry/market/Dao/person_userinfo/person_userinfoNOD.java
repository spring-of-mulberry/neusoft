package com.mulberry.market.Dao.person_userinfo;

import com.mulberry.market.Comment.baseSql;
import com.mulberry.market.Entity.userinfo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class person_userinfoNOD extends baseSql {
    //管理员通过用户编号查询数据
    public List<userinfo> person_userinfo_selectNO(userinfo userinfo) {
        String sql = "select * from userinfo where userno=?";
        Object[] objects = {userinfo.getUserno()};
        return this.selectDo(sql,objects,"管理员通过用户编号查询收银员用户表");
    }
    protected List<userinfo> resultToList(ResultSet rs) throws SQLException {
        List<userinfo> list = new ArrayList<userinfo>();
        while (rs.next()){
            userinfo userinfo = new userinfo();
            userinfo.setUserno(rs.getInt("userno"));
            userinfo.setUname(rs.getString("uname"));
            userinfo.setPhone(rs.getString("phone"));
            userinfo.setAccount(rs.getString("account"));
            userinfo.setPwd(rs.getString("pwd"));
            userinfo.setIsadmin(rs.getInt("isadmin"));
            userinfo.setIsenable(rs.getInt("isenable"));
            list.add(userinfo);
        }
        return list;
    }
}
