package com.designpatterns.creational.prototype;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@Data
public class Student implements Serializable {

    private String name;
    private int age;
    private LocalDate dateOfRegistration;
    private Address address;

    public Student(String name, int age, LocalDate dateOfRegistration, Address address) {
        this.name = name;
        this.age = age;
        this.dateOfRegistration = dateOfRegistration;
        this.address = address;
    }

}
