package com.designpatterns.creational.factory.v2;

public interface Car {

    enum EngineType{
        ELECTRIC,
        COMBUSTION
    }

    public EngineType getEngineType();
    public void drive();
    public String fuelVehicle();

    public static class Factory{
        public static Car newElectricCar(){
            return new ElectricCar();
        }

        public static Car newCombustionEngineCar(){
            return new CombustionEngineCar();
        }

        public static Car newCar(String type){
            if(type.equalsIgnoreCase("ev")){
                return new ElectricCar();
            }
            else if(type.equalsIgnoreCase("ice")){
                return new CombustionEngineCar();
            }
            throw new IllegalArgumentException();
        }
    }

}
