package com.designpatterns.structural.facade;

import lombok.Data;

@Data
public class Car {

    private String owner;
    private String color;
    private int productionYear;
    private Wheels wheels;
    private Engine engine;


    // constructor with facade within
    public Car(String owner, String color, int productionYear,
               String tireBrand, int tireSize, int engineCylinders) {
        this.owner = owner;
        this.color = color;
        this.productionYear = productionYear;
        this.wheels = new Wheels(tireBrand, tireSize);
        this.engine = new Engine(productionYear, engineCylinders);
    }

    public Car(String owner, String color, int productionYear, Wheels wheels, Engine engine) {
        this.owner = owner;
        this.color = color;
        this.productionYear = productionYear;
        this.wheels = wheels;
        this.engine = engine;
    }
}
