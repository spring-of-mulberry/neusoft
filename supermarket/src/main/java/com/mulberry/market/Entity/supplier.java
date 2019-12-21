package com.mulberry.market.Entity;

public class supplier {
    private int supplierno;
    private String suppliername;
    private String suppliermanager;
    private String suppliercontact;
    private long suppliercontactphone;
    private String supplieraddress;

    public int getSupplierno() {
        return supplierno;
    }

    public void setSupplierno(int supplierno) {
        this.supplierno = supplierno;
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername;
    }

    public String getSuppliermanager() {
        return suppliermanager;
    }

    public void setSuppliermanager(String suppliermanager) {
        this.suppliermanager = suppliermanager;
    }

    public String getSuppliercontact() {
        return suppliercontact;
    }

    public void setSuppliercontact(String suppliercontact) {
        this.suppliercontact = suppliercontact;
    }

    public long getSuppliercontactphone() {
        return suppliercontactphone;
    }

    public void setSuppliercontactphone(long suppliercontactphone) {
        this.suppliercontactphone = suppliercontactphone;
    }

    public String getSupplieraddress() {
        return supplieraddress;
    }

    public void setSupplieraddress(String supplieraddress) {
        this.supplieraddress = supplieraddress;
    }

    public supplier() {
    }

    public supplier(int supplierno, String suppliername, String suppliermanager, String suppliercontact, long suppliercontactphone, String supplieraddress) {
        this.supplierno = supplierno;
        this.suppliername = suppliername;
        this.suppliermanager = suppliermanager;
        this.suppliercontact = suppliercontact;
        this.suppliercontactphone = suppliercontactphone;
        this.supplieraddress = supplieraddress;
    }
}
