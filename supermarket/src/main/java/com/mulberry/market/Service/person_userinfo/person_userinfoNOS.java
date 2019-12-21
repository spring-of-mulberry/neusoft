package com.mulberry.market.Service.person_userinfo;

import com.mulberry.market.Dao.person_userinfo.person_userinfoDao;
import com.mulberry.market.Dao.person_userinfo.person_userinfoNOD;
import com.mulberry.market.Entity.userinfo;

import java.util.List;

public class person_userinfoNOS {
    person_userinfoNOD person_userinfoNOD = new person_userinfoNOD();
    public List<userinfo> person_userinfo_selectNO(userinfo userinfo) {
        return person_userinfoNOD.person_userinfo_selectNO(userinfo);
    }
}
