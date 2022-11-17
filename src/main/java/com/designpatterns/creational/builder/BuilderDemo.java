package com.designpatterns.creational.builder;

import java.time.LocalDate;

public class BuilderDemo {

    public static void main(String[] args) {

        Student currentStudent = Student.registerNewStudent()
                .withName("John")
                .withSurname("Doe")
                .withAge(20)
                .withGraduated(false)
                .build();

        Student graduatedStudent = Student.existingStudent(LocalDate.ofYearDay(2007, 20))
                .withName("George")
                .withSurname("Doe")
                .withAge(23)
                .withGraduated(true)
                .build();


        StudentLombok build = StudentLombok.builder()
                .name("Lombok")
                .surname("Builder")
                .age(5)
                .dateOfRegistration(LocalDate.now())
                .graduated(true).build();

    }

}
