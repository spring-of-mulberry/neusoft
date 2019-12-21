package com.mulberry.market.Entity;

import java.util.Date;

public class goodsoperater {
    private int goodsoperaterid;
    private int userno;
    private String barcode;
    private String goodsname;
    private Date onsaledate;
    private double onsaleprice;
    private int state;

    public int getGoodsoperaterid() {
        return goodsoperaterid;
    }

    public void setGoodsoperaterid(int goodsoperaterid) {
        this.goodsoperaterid = goodsoperaterid;
    }

    public int getUserno() {
        return userno;
    }

    public void setUserno(int userno) {
        this.userno = userno;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Date getOnsaledate() {
        return onsaledate;
    }

    public void setOnsaledate(Date onsaledate) {
        this.onsaledate = onsaledate;
    }

    public double getOnsaleprice() {
        return onsaleprice;
    }

    public void setOnsaleprice(double onsaleprice) {
        this.onsaleprice = onsaleprice;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public goodsoperater() {
    }

    public goodsoperater(int goodsoperaterid, int userno, String barcode, String goodsname, Date onsaledate, double onsaleprice, int state) {
        this.goodsoperaterid = goodsoperaterid;
        this.userno = userno;
        this.barcode = barcode;
        this.goodsname = goodsname;
        this.onsaledate = onsaledate;
        this.onsaleprice = onsaleprice;
        this.state = state;
    }
}
