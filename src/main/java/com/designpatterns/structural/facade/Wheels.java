package com.designpatterns.structural.facade;

import lombok.Data;

@Data
public class Wheels {

    private String tireBrand;
    private int tireSize;

    public Wheels(String tireBrand, int tireSize) {
        this.tireBrand = tireBrand;
        this.tireSize = tireSize;
    }

}
