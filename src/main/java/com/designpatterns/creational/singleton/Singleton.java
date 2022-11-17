package com.designpatterns.creational.singleton;

public class Singleton {

    private static Singleton instance;
    private String value;

    private Singleton(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            synchronized (Singleton.class) {
                // check again as multiple threads
                // can reach above step
                if(instance == null) {
                    instance = new Singleton(value);
                }
            }
        }
        return instance;
    }

    public String getValue() {
        return value;
    }
}
