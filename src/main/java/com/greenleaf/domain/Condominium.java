package com.greenleaf.domain;

/**
 * Created by User on 3/27/2019.
 */
public class Condominium implements Residence {
    Condominium(String id, String address) {
        this.address= address;
        this.id = id;
    }
    String address;

    String id;

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getAddress() {
        return this.address;
    }
}
