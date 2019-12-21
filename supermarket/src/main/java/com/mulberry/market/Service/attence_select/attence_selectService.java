package com.mulberry.market.Service.attence_select;

import com.mulberry.market.Entity.attenceinfo;

import java.util.List;

public interface attence_selectService {
    //管理员根据员工编号查询收银员考勤记录
    List<attenceinfo> attence_select();
}
