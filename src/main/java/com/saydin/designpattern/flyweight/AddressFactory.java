package com.saydin.designpattern.flyweight;

import java.util.LinkedHashMap;
import java.util.Map;

public class AddressFactory {

    private static Map<String, Address> adress=new LinkedHashMap<>();

    public static Address getAdress(String adresId){

        Address returnAdress= adress.get(adresId);

        if(returnAdress==null){ // havuzda bu adresden yoksa üret
            System.out.println(adresId + " için beni çağırdı");
            returnAdress=new Address(adresId); //genellikle db den çekeriz.
            adress.put(adresId,returnAdress);
        }
        return returnAdress;
    }
}
