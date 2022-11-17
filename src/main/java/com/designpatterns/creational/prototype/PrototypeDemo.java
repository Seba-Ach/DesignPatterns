package com.designpatterns.creational.prototype;

import org.apache.commons.lang3.SerializationUtils;

import java.time.LocalDate;

public class PrototypeDemo {

    public static void main(String[] args) {

        //Define an Address and assign it to both Students
        Address address = new Address("Oxford street", 5);

        Student john = new Student("John", 22, LocalDate.now(), address);
        Student george = new Student("George", 25, LocalDate.now(), address);
        // Both Students have the same Address
        System.out.println("Johns address is " + john.getAddress().toString());
        System.out.println("Georges address is " + george.getAddress().toString());


        george.getAddress().setHouseNum(6);
        // Changing house number for Georges Address cascades the changes to Johns Address as well
        System.out.println("Johns address is " + john.getAddress().toString());
        System.out.println("Georges address is " + george.getAddress().toString());


        john.setAge(90);
        // Changing age for John does not cascades the changes to Georges age as it is a primitive and not an Object
        System.out.println("Johns age is " + john.getAge());
        System.out.println("Georges age is " + george.getAge());


        john.setName("John changed name");
        // Changing name for John does not cascades the changes to Georges name as it Strings are immutable and reassigned
        System.out.println("Johns name is " + john.getName());
        System.out.println("Georges age is " + george.getName());


        // Create a deep copy of John and assign it to Chris
        Student chris = SerializationUtils.roundtrip(john);
        chris.setName("Chris");
        // Here we see they all have the same address but internally Chriss Address is pointing to different memory
        System.out.println("Johns address is " + john.getAddress().toString());
        System.out.println("Georges address is " + george.getAddress().toString());
        System.out.println("Chris address is " + chris.getAddress().toString());


        george.getAddress().setHouseNum(8);
        chris.getAddress().setHouseNum(12);
        // Changing Georges address cascades to Johns but not Chriss and vice versa
        System.out.println("Johns address is " + john.getAddress().toString());
        System.out.println("Georges address is " + george.getAddress().toString());
        System.out.println("Chris address is " + chris.getAddress().toString());
    }

}
