package cn.mulberry.jdbc.demoEntity;


import java.sql.Date;

public class User {
    private String uname;
    private String upwd;
    private String uemail;
    private Date ubirthday;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public Date getUbirthday() {
        return ubirthday;
    }

    public void setUbirthday(Date ubirthday) {
        this.ubirthday = ubirthday;
    }

    public User(String uname, String upwd, String uemail, Date ubirthday) {
        this.uname = uname;
        this.upwd = upwd;
        this.uemail = uemail;
        this.ubirthday = ubirthday;
    }
    public User() {

    }
}
