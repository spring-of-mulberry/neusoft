package com.mulberry.wx.entity;

public class product {
    private int id;
    private String pname;
    private float pprice;
    private int pcount;
    private String pimage;
    private String pdetails;
    private int pfenid;
    private String pfenname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public float getPprice() {
        return pprice;
    }

    public void setPprice(float pprice) {
        this.pprice = pprice;
    }

    public int getPcount() {
        return pcount;
    }

    public void setPcount(int pcount) {
        this.pcount = pcount;
    }

    public String getPimage() {
        return pimage;
    }

    public void setPimage(String pimage) {
        this.pimage = pimage;
    }

    public String getPdetails() {
        return pdetails;
    }

    public void setPdetails(String pdetails) {
        this.pdetails = pdetails;
    }

    public int getPfenid() {
        return pfenid;
    }

    public void setPfenid(int pfenid) {
        this.pfenid = pfenid;
    }

    public String getPfenname() {
        return pfenname;
    }

    public void setPfenname(String pfenname) {
        this.pfenname = pfenname;
    }

    public product() {
    }

    public product(int id, String pname, float pprice, int pcount, String pimage, String pdetails, int pfenid, String pfenname) {
        this.id = id;
        this.pname = pname;
        this.pprice = pprice;
        this.pcount = pcount;
        this.pimage = pimage;
        this.pdetails = pdetails;
        this.pfenid = pfenid;
        this.pfenname = pfenname;
    }
}
