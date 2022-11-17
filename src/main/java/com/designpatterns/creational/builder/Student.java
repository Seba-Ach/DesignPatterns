package com.designpatterns.creational.builder;

import java.time.LocalDate;

public class Student {

    private final String name;
    private final String surname;
    private final int age;
    private final boolean graduated;
    private final LocalDate dateOfRegistration;

    private Student(String name, String surname, int age, boolean graduated, LocalDate dateOfRegistration) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.graduated = graduated;
        this.dateOfRegistration = dateOfRegistration;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public boolean isGraduated() {
        return graduated;
    }

    public LocalDate getDateOfRegistration() {
        return dateOfRegistration;
    }

    public static Builder registerNewStudent(){
        return new Builder(LocalDate.now());
    }

    public static Builder existingStudent(LocalDate localDate){
        return new Builder(LocalDate.now());
    }


    static class Builder {

        private String name;
        private String surname;
        private int age;
        private boolean graduated;
        private LocalDate dateOfRegistration;

        public Builder(LocalDate dateOfRegistration) {
            this.dateOfRegistration = dateOfRegistration;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder withAge(int age) {
            this.age = age;
            return this;
        }

        public Builder withGraduated(boolean graduated) {
            graduated = graduated;
            return this;
        }

        public Student build(){
            return new Student(name, surname, age, graduated, dateOfRegistration);
        }
    }

}
