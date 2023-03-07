package com.saydin.designpattern.flyweight;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Address {
    private String id;
    private String adres;

    public Address(String id) {
        this.id = id;
    }
}
