package com.mulberry.market.Entity;

public class userinfo {
    private int userno;
    private String uname;
    private String phone;
    private String account;
    private String pwd;
    private int isadmin;
    private int isenable;

    public int getUserno() {
        return userno;
    }

    public void setUserno(int userno) {
        this.userno = userno;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getIsadmin() {
        return isadmin;
    }

    public void setIsadmin(int isadmin) {
        this.isadmin = isadmin;
    }

    public int getIsenable() {
        return isenable;
    }

    public void setIsenable(int isenable) {
        this.isenable = isenable;
    }

    public userinfo() {
    }

    public userinfo(int userno, String uname, String phone, String account, String pwd, int isadmin, int isenable) {
        this.userno = userno;
        this.uname = uname;
        this.phone = phone;
        this.account = account;
        this.pwd = pwd;
        this.isadmin = isadmin;
        this.isenable = isenable;
    }
}
