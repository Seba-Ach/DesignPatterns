package com.designpatterns.creational.builder;


import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Builder
@Getter
public class StudentLombok {

    private final String name;
    private final String surname;
    private final int age;
    private final boolean graduated;
    private final LocalDate dateOfRegistration;

}
