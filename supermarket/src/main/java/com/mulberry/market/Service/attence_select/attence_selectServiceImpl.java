package com.mulberry.market.Service.attence_select;

import com.mulberry.market.Dao.attence_select.attence_selectDao;
import com.mulberry.market.Dao.attence_select.attence_selectDaoImpl;
import com.mulberry.market.Entity.attenceinfo;

import java.util.List;

public class attence_selectServiceImpl implements attence_selectService {
    private attence_selectDao attence_selectDao = new attence_selectDaoImpl();
    //管理员根据员工编号查询收银员考勤记录
    public List<attenceinfo> attence_select() {
        return attence_selectDao.attence_select();
    }
}
