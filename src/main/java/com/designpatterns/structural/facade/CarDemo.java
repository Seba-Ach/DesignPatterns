package com.designpatterns.structural.facade;

public class CarDemo {

    public static void main(String[] args) {
        Car car = new Car("Owner", "Red", 2022, "tiredBrand", 20, 6);


        Wheels tiredBrand = new Wheels("tiredBrand", 22);
        Engine engine = new Engine(2022, 6);
        Car car1 = new Car("Owner", "Red", 2022, tiredBrand, engine);
    }

}
