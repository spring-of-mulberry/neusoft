package com.mulberry.market.Entity;

import java.util.Date;

public class purchase {
    private int purchaseid;
    private String goodscode;
    private String goodsname;
    private Date purchasetime;
    private int purchaseocunt;
    private double purchaseprice;
    private int supplierno;

    public int getPurchaseid() {
        return purchaseid;
    }

    public void setPurchaseid(int purchaseid) {
        this.purchaseid = purchaseid;
    }

    public String getGoodscode() {
        return goodscode;
    }

    public void setGoodscode(String goodscode) {
        this.goodscode = goodscode;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public Date getPurchasetime() {
        return purchasetime;
    }

    public void setPurchasetime(Date purchasetime) {
        this.purchasetime = purchasetime;
    }

    public int getPurchaseocunt() {
        return purchaseocunt;
    }

    public void setPurchaseocunt(int purchaseocunt) {
        this.purchaseocunt = purchaseocunt;
    }

    public double getPurchaseprice() {
        return purchaseprice;
    }

    public void setPurchaseprice(double purchaseprice) {
        this.purchaseprice = purchaseprice;
    }

    public int getSupplierno() {
        return supplierno;
    }

    public void setSupplierno(int supplierno) {
        this.supplierno = supplierno;
    }

    public purchase() {
    }

    public purchase(int purchaseid, String goodscode, String goodsname, Date purchasetime, int purchaseocunt, double purchaseprice, int supplierno) {
        this.purchaseid = purchaseid;
        this.goodscode = goodscode;
        this.goodsname = goodsname;
        this.purchasetime = purchasetime;
        this.purchaseocunt = purchaseocunt;
        this.purchaseprice = purchaseprice;
        this.supplierno = supplierno;
    }
}
