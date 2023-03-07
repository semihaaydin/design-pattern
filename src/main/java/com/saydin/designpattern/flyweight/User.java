package com.saydin.designpattern.flyweight;

public class User {

    public String getAdres(String adressId){
        return AddressFactory.getAdress(adressId).getAdres();
    }

}
