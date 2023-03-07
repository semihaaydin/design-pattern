package com.saydin.designpattern.flyweight;

public class BillingUser {

    public String getAddress(String adresId){
        return AddressFactory.getAdress(adresId).getAdres();
    }
}
