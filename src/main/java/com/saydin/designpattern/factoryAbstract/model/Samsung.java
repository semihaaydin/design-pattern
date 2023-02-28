package com.saydin.designpattern.factoryAbstract.model;

public class Samsung implements Telephone {

    public Samsung(String model, String name){
        model=getModel();
        name=getName();
    }

    @Override
    public String getName() {
        return "Samsung";
    }

    @Override
    public String getModel() {
        return "S7";
    }


}
