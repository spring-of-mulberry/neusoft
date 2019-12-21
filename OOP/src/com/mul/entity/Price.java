package com.mul.entity;

public class Price {
    private int prid;//商品编号
    private double prprice;//促销价格
    private String starttime;//促销开始时间
    private String endtime;//促销结束时间

    public Price(int prid, double prprice, String starttime, String endtime) {
        this.prid = prid;
        this.prprice = prprice;
        this.starttime = starttime;
        this.endtime = endtime;
    }

    public int getPrid() {
        return prid;
    }

    public void setPrid(int prid) {
        this.prid = prid;
    }

    public double getPrprice() {
        return prprice;
    }

    public void setPrprice(double prprice) {
        this.prprice = prprice;
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
