package com.saydin.designpattern.factoryAbstract;

import com.saydin.designpattern.factoryAbstract.model.Samsung;
import com.saydin.designpattern.factoryAbstract.model.Telephone;

public class SamsungFactory implements TelephoneFactory{

    @Override
    public Telephone getTelephone(String model, String name) {
        return new Samsung(model,name);
    }
}
