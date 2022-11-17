package com.designpatterns.creational.factory.v1;

public class FactoryV1Demo {

    public static void main(String[] args) {

        Car ceCar = new CombustionEngineCarFactory().prepareCarForPickup();
        ceCar.drive();

        Car evCar = new ElectricCarFactory().prepareCarForPickup();
        evCar.drive();

    }

}
