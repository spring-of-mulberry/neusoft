package com.mulberry.market.Controller.person_userinfo;

import com.mulberry.market.Entity.userinfo;
import com.mulberry.market.Service.person_userinfo.person_userinfoNOS;

import java.util.List;

public class person_userinfoNOC {
    person_userinfoNOS person_userinfoNOS = new person_userinfoNOS();
    public List<userinfo> person_userinfo_selectNo(int userno){
        userinfo userinfo = new userinfo();
        userinfo.setUserno(userno);
        return person_userinfoNOS.person_userinfo_selectNO(userinfo);
    }
}
