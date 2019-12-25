package com.mulberry.springMVC01.entity;

public class product {
    private int id;
    private String name;
    private int count;
    private double price;
    private String details;

    public product() {
    }

    public product(int id, String name, int count, double price, String details) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.price = price;
        this.details = details;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
