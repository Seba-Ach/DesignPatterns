package com.designpatterns.creational.factory.v2;

public class FactoryV2Demo {

    public static void main(String[] args) {

        Car ceCar = Car.Factory.newCombustionEngineCar();
        ceCar.drive();
        ceCar.getEngineType();

        Car evCar = Car.Factory.newElectricCar();
        evCar.drive();
        evCar.getEngineType();

        Car ev = Car.Factory.newCar("ev");
        ev.drive();
        ev.getEngineType();
    }

}
