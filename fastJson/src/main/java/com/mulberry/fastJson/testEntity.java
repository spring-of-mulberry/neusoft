package com.mulberry.fastJson;

import java.util.Date;

public class testEntity {
    private Integer uid;
    private String uname;
    private Date cdate;

    public testEntity() {
    }

    public testEntity(Integer uid, String uname, Date cdate) {
        this.uid = uid;
        this.uname = uname;
        this.cdate = cdate;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Date getCdate() {
        return cdate;
    }

    public void setCdate(Date cdate) {
        this.cdate = cdate;
    }
}
