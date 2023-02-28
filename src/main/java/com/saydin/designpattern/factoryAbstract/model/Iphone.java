package com.saydin.designpattern.factoryAbstract.model;

public class Iphone implements Telephone {

    @Override
    public String getName() {
        return "iphone";
    }

    @Override
    public String getModel() {
        return "11";
    }
}
