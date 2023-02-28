package com.saydin.designpattern.factoryAbstract;

import com.saydin.designpattern.factoryAbstract.model.Telephone;

public interface TelephoneFactory {
    Telephone getTelephone(String model,String name);
}
