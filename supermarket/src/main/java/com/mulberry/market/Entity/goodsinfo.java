package com.mulberry.market.Entity;

public class goodsinfo {
    private String goodscode;
    private int userno;
    private int goodstype;
    private String goodssunit;
    private String goodsname;
    private int goodsalarm;
    private double goodsprice;
    private int goodstock;

    public String getGoodscode() {
        return goodscode;
    }

    public void setGoodscode(String goodscode) {
        this.goodscode = goodscode;
    }

    public int getUserno() {
        return userno;
    }

    public void setUserno(int userno) {
        this.userno = userno;
    }

    public int getGoodstype() {
        return goodstype;
    }

    public void setGoodstype(int goodstype) {
        this.goodstype = goodstype;
    }

    public String getGoodssunit() {
        return goodssunit;
    }

    public void setGoodssunit(String goodssunit) {
        this.goodssunit = goodssunit;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public int getGoodsalarm() {
        return goodsalarm;
    }

    public void setGoodsalarm(int goodsalarm) {
        this.goodsalarm = goodsalarm;
    }

    public double getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(double goodsprice) {
        this.goodsprice = goodsprice;
    }

    public int getGoodstock() {
        return goodstock;
    }

    public void setGoodstock(int goodstock) {
        this.goodstock = goodstock;
    }

    public goodsinfo() {
    }

    public goodsinfo(String goodscode, int userno, int goodstype, String goodssunit, String goodsname, int goodsalarm, double goodsprice, int goodstock) {
        this.goodscode = goodscode;
        this.userno = userno;
        this.goodstype = goodstype;
        this.goodssunit = goodssunit;
        this.goodsname = goodsname;
        this.goodsalarm = goodsalarm;
        this.goodsprice = goodsprice;
        this.goodstock = goodstock;
    }
}
