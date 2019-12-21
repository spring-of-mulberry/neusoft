package com.mulberry.market.Service.person_userinfo;

import com.mulberry.market.Dao.person_userinfo.person_userinfoDao;
import com.mulberry.market.Dao.person_userinfo.person_userinfoDaoImpl;
import com.mulberry.market.Entity.userinfo;

import java.util.List;

public class person_userinfoServiceImpl implements person_userinfoService {
    person_userinfoDao person_userinfoDao = new person_userinfoDaoImpl();
    public List<userinfo> person_userinfo_select(userinfo userinfo) {
        return person_userinfoDao.person_userinfo_select(userinfo);
    }
    public List<userinfo> person_userinfoAccount_select(userinfo userinfo){
        return person_userinfoDao.person_userinfoAccount_select(userinfo);
    }
    public int person_userinfo_insert(userinfo userinfo) {
        return person_userinfoDao.person_userinfo_insert(userinfo);
    }

    public int person_userinfo_update(userinfo userinfo) {
        return person_userinfoDao.person_userinfo_update(userinfo);
    }

    public int person_userinfo_delete(userinfo userinfo) {
        return person_userinfoDao.person_userinfo_delete(userinfo);
    }
}
