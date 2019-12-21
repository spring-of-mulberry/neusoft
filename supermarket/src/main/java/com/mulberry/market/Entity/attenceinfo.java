package com.mulberry.market.Entity;

import java.sql.Date;

public class attenceinfo {
    private int attenceno;
    private int userno;
    private int onduty;
    private Date ondutydate;
    private int offduty;
    private Date offdutydate;

    public int getAttenceno() {
        return attenceno;
    }

    public void setAttenceno(int attenceno) {
        this.attenceno = attenceno;
    }

    public int getUserno() {
        return userno;
    }

    public void setUserno(int userno) {
        this.userno = userno;
    }

    public int getOnduty() {
        return onduty;
    }

    public void setOnduty(int onduty) {
        this.onduty = onduty;
    }

    public Date getOndutydate() {
        return ondutydate;
    }

    public void setOndutydate(Date ondutydate) {
        this.ondutydate = ondutydate;
    }

    public int getOffduty() {
        return offduty;
    }

    public void setOffduty(int offduty) {
        this.offduty = offduty;
    }

    public Date getOffdutydate() {
        return offdutydate;
    }

    public void setOffdutydate(Date offdutydate) {
        this.offdutydate = offdutydate;
    }

    public attenceinfo() {
    }

    public attenceinfo(int attenceno, int userno, int onduty, Date ondutydate, int offduty, Date offdutydate) {
        this.attenceno = attenceno;
        this.userno = userno;
        this.onduty = onduty;
        this.ondutydate = ondutydate;
        this.offduty = offduty;
        this.offdutydate = offdutydate;
    }
}
