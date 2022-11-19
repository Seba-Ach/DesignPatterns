package com.designpatterns.structural.facade;

public class CarMechanic {

    public Car serviceCar(Car car){

        Car servicedWheels = serviceWheels(car);

        Car servicedCar = serviceEngine(servicedWheels);

        return servicedCar;
    }

    private Car serviceWheels(Car car){
        // do something to wheels here
        return car;
    }

    private Car serviceEngine(Car car){
        // do something to wheels here
        return car;
    }

}
