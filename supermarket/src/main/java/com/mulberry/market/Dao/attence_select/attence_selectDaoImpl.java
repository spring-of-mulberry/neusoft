package com.mulberry.market.Dao.attence_select;

import com.mulberry.market.Comment.baseSql;
import com.mulberry.market.Entity.attenceinfo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class attence_selectDaoImpl extends baseSql implements attence_selectDao {
    //管理员根据员工编号查询收银员考勤记录
    public List<attenceinfo> attence_select() {
        String sql = "select * from attenceinfo";
        return this.selectDo(sql,null,"考勤记录");
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
}
