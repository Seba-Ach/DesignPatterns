package com.designpatterns.creational.factory.v2;

public class ElectricCar implements Car {

    private int batteryLife;

    @Override
    public EngineType getEngineType() {
        System.out.println("This car has an electric engine");
        return EngineType.ELECTRIC;
    }

    @Override
    public void drive() {
        System.out.println("Driving the electric vehicle car");
        // Use electrical energy to make car drive
    }

    @Override
    public String fuelVehicle() {
        batteryLife = 100;
        return "Your electric vehicle has been charged to 100%";
    }

}
