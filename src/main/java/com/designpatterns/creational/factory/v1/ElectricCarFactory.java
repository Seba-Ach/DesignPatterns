package com.designpatterns.creational.factory.v1;

public class ElectricCarFactory implements CarFactory{
    @Override
    public Car prepareCarForPickup() {
        ElectricCar electricCar = new ElectricCar();
        electricCar.fuelVehicle();

        return electricCar;
    }
}
