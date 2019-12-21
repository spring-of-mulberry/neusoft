package com.mul.entity;

public class Product {
    private int pid;//商品编号
    private String pname;//商品名称
    private double pdate;//商品保修日期
    private double pprice;//商品价格
    private boolean cx;//商品是否促销
    private double sprice;//促销价格
    private String starttime;//促销开始时间
    private String endtime;//促销结束时间

    public Product() {

    }
    public Product(int pid, String pname, double pdate, double pprice, boolean cx ) {
        this.pid = pid;
        this.pname = pname;
        this.pdate = pdate;
        this.pprice = pprice;
        this.cx = cx;

    }

    public Product(int pid, String pname, double pdate, double pprice, boolean cx, double sprice, String starttime, String endtime) {
        this.pid = pid;
        this.pname = pname;
        this.pdate = pdate;
        this.pprice = pprice;
        this.cx = cx;
        this.sprice = sprice;
        this.starttime = starttime;
        this.endtime = endtime;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public double getPdate() {
        return pdate;
    }

    public void setPdate(double pdate) {
        this.pdate = pdate;
    }

    public double getPprice() {
        return pprice;
    }

    public void setPprice(double pprice) {
        this.pprice = pprice;
    }

    public boolean isCx() {
        return cx;
    }

    public void setCx(boolean cx) {
        this.cx = cx;
    }

    public double getSprice() {
        return sprice;
    }

    public void setSprice(double sprice) {
        this.sprice = sprice;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }
}
