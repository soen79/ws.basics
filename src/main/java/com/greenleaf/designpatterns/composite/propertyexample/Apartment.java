package com.greenleaf.designpatterns.composite.propertyexample;

/**
 * Created by User on 10/19/2019.
 */
public class Apartment implements Property {

    float price;
    String address;
    String builder;

    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getBuilder() {
        return builder;
    }
    public void setBuilder(String builder) {
        this.builder = builder;
    }

    @Override
    public void purchase() {

    }

    @Override
    public void sell() {

    }
}
