package com.designpatterns.creational.factory.v1;

public class CombustionEngineCar implements Car{

    private int gasLiters;

    @Override
    public void drive() {
        System.out.println("Driving the combustion engine car");
        // Combustion of fuel in the heat engine to make car drive
    }

    @Override
    public String fuelVehicle() {
        gasLiters=5;
        return "Filled vehicle tank to 5liters";
    }

}
