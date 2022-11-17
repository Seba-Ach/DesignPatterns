package com.designpatterns.creational.factory.v1;

public class CombustionEngineCarFactory implements CarFactory{
    @Override
    public Car prepareCarForPickup() {
        CombustionEngineCar combustionEngineCar = new CombustionEngineCar();
        combustionEngineCar.fuelVehicle();

        return combustionEngineCar;
    }
}
