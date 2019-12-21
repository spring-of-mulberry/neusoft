package com.mulberry.market.Service.login;

import com.mulberry.market.Dao.login.marketDao;
import com.mulberry.market.Dao.login.marketDaoImpl;
import com.mulberry.market.Entity.userinfo;
import com.mulberry.market.Service.login.marketService;

import java.util.List;

public class marketServiceImpl implements marketService {
    private marketDao dao = new marketDaoImpl();
        //登录操作
        public List<userinfo> userlogin(userinfo uinfo) {
        return dao.userlogin(uinfo);
    }
}
