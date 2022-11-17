package com.designpatterns.creational.prototype;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Data
public class Address implements Serializable {

    private String streetName;
    private int houseNum;

    public Address(String streetName, int houseNum) {
        this.streetName = streetName;
        this.houseNum = houseNum;
    }

}
