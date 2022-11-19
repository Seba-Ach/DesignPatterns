package com.designpatterns.structural.facade;

public class Engine {

    private int productionYear;
    private int numOfCylinders;

    public Engine(int productionYear, int numOfCylinders) {
        this.productionYear = productionYear;
        this.numOfCylinders = numOfCylinders;
    }
}
