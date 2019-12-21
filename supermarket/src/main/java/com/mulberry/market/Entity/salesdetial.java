package com.mulberry.market.Entity;

import java.util.Date;

public class salesdetial {
    private int detialid;
    private int userno;
    private String barcode;
    private int count;
    private double unitprice;
    private double sumprice;
    private Date saledate;

    public int getDetialid() {
        return detialid;
    }

    public void setDetialid(int detialid) {
        this.detialid = detialid;
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }

    public double getSumprice() {
        return sumprice;
    }

    public void setSumprice(double sumprice) {
        this.sumprice = sumprice;
    }

    public Date getSaledate() {
        return saledate;
    }

    public void setSaledate(Date saledate) {
        this.saledate = saledate;
    }

    public salesdetial() {
    }

    public salesdetial(int detialid, int userno, String barcode, int count, double unitprice, double sumprice, Date saledate) {
        this.detialid = detialid;
        this.userno = userno;
        this.barcode = barcode;
        this.count = count;
        this.unitprice = unitprice;
        this.sumprice = sumprice;
        this.saledate = saledate;
    }
}
