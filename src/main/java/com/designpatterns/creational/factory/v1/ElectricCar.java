package com.designpatterns.creational.factory.v1;

public class ElectricCar implements Car{

    private int batteryLife;

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
