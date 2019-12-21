package com.mulberry.market.Dao.person_work;

import com.mulberry.market.Comment.baseSql;
import com.mulberry.market.Entity.attenceinfo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class person_workDaoImpl extends baseSql implements person_workDao {
    //判断员工编号的存在和下班状态存在打卡
    //通过员工编号插入值
    public int gworkByAttenceno(attenceinfo attenceinfo) {
        String sql = "insert into attenceinfo(userno,onduty,offduty) value(?,?,?)";
        Object[] objects = {
                attenceinfo.getUserno(),
                attenceinfo.getOnduty(),
                attenceinfo.getOffduty()
        };
        return this.iduDo(sql,objects,"通过编号对员工进行打卡上班操作");
    }






    //通过编号查找集合
    public List<attenceinfo> worktimeByAttenceno() {
        String sql = "select * from attenceinfo";
        Object[] objects = null;
        return this.selectDo(sql,objects,"通过编号查找集合");
    }
    //根据员工编号和上班状态查询一个集合
    public List<attenceinfo> useronduty(attenceinfo attenceinfo){
        String sql = "select * from attenceinfo where attenceno=? and onduty=?";
        Object[] objects ={
                attenceinfo.getAttenceno(),
                attenceinfo.getOnduty()
        };
        return this.selectDo(sql,objects,"根据员工编号和上班状态查询一个集合");
    }
    //上班打卡
    public int gworkdaka(attenceinfo attenceinfo){
        String sql = "update attenceinfo set onduty=?,ondutydate=? where attenceno=?";
        Object[] objects = {
                attenceinfo.getOnduty(),
                attenceinfo.getOndutydate(),
                attenceinfo.getAttenceno()
        };
        return this.iduDo(sql,objects,"上班打卡");
    }

    protected List<attenceinfo> resultToList(ResultSet rs) throws SQLException {
        List<attenceinfo> list = new ArrayList<attenceinfo>();
        while (rs.next()){
            attenceinfo attenceinfo = new attenceinfo();
            attenceinfo.setAttenceno(rs.getInt("attenceno"));
            attenceinfo.setUserno(rs.getInt("userno"));
            attenceinfo.setOnduty(rs.getInt("onduty"));
            attenceinfo.setOndutydate(rs.getDate("ondutydate"));
            attenceinfo.setOffduty(rs.getInt("offduty"));
            attenceinfo.setOffdutydate(rs.getDate("offdutydate"));
            list.add(attenceinfo);
        }
        return list;
    }








    //通过编号查找集合
    public List<attenceinfo> worktimeByAttenceno1() {
        String sql = "select * from attenceinfo";
        Object[] objects = null;
        return this.selectDo(sql,objects,"通过编号查找集合");
    }
    //根据员工编号和上班状态查询一个集合
    public List<attenceinfo> useroffduty(attenceinfo attenceinfo){
        String sql = "select * from attenceinfo where attenceno=? and offduty=?";
        Object[] objects ={
                attenceinfo.getAttenceno(),
                attenceinfo.getOffduty()
        };
        return this.selectDo(sql,objects,"根据员工编号和上班状态查询一个集合");
    }
    //上班打卡
    public int lworkdaka(attenceinfo attenceinfo){
        String sql = "update attenceinfo set offduty=?,offdutydate=? where attenceno=?";
        Object[] objects = {
                attenceinfo.getOffduty(),
                attenceinfo.getOffdutydate(),
                attenceinfo.getAttenceno()
        };
        return this.iduDo(sql,objects,"上班打卡");
    }



}
