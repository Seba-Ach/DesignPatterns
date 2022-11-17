package com.designpatterns.creational.factory.v2;

public class CombustionEngineCar implements Car {

    private int gasLiters;

    @Override
    public EngineType getEngineType() {
        System.out.println("This car has a combustion engine");
        return EngineType.COMBUSTION;
    }

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
