package com.designpatterns.creational.singleton;

public class SingletonDemo {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance("FIRST");
        System.out.println(singleton.getValue());

        Singleton anotherSingleton = Singleton.getInstance("SECOND");
        System.out.println(singleton.getValue());
        System.out.println(anotherSingleton.getValue());



    }

}
