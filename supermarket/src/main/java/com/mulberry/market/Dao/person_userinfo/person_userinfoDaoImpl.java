package com.mulberry.market.Dao.person_userinfo;

import com.mulberry.market.Comment.baseSql;
import com.mulberry.market.Entity.userinfo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class person_userinfoDaoImpl extends baseSql implements person_userinfoDao {
    //查询
    public List<userinfo> person_userinfo_select(userinfo userinfo) {
        String sql = "select * from userinfo where isadmin=?";
        Object[] objects = {userinfo.getIsadmin()};
        return this.selectDo(sql,objects,"管理员查询收银员用户表");
    }
    public List<userinfo> person_userinfoAccount_select(userinfo userinfo){
        String sql = "select * from userinfo where account=?";
        Object[] objects = {userinfo.getAccount()};
        return this.selectDo(sql,objects,"管理员通过账户查找收银员表");
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
//    插入
    public int person_userinfo_insert(userinfo userinfo) {
        String sql = "insert into userinfo values(?,?,?,?,?,?,?)";
        Object[] objects = {
                userinfo.getUserno(),
                userinfo.getUname(),
                userinfo.getPhone(),
                userinfo.getAccount(),
                userinfo.getPwd(),
                userinfo.getIsadmin(),
                userinfo.getIsenable()
        };
        return this.iduDo(sql,objects,"向用户表中插入一条收银员信息");
    }
//    修改
    public int person_userinfo_update(userinfo userinfo) {
        String sql = "update userinfo set uname=?,phone=?,isadmin=?,isenable=? where account=?";
        Object[] objects = {
                userinfo.getUname(),
                userinfo.getPhone(),
                userinfo.getIsadmin(),
                userinfo.getIsenable(),
                userinfo.getAccount()
        };
        return this.iduDo(sql,objects,"修改收银员姓名，电话，是否激活等信息信息");
    }
//    删除
    public int person_userinfo_delete(userinfo userinfo) {
        String sql = "delete from userinfo where account=?";
        Object[] objects = {userinfo.getAccount()};
        return this.iduDo(sql,objects,"根据用户编号删除收银员信息");
    }

}
