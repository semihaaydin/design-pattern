package com.saydin.designpattern.factoryAbstract;

public class Run {
    public static void main(String[] args) {
        SamsungFactory s=new SamsungFactory();
        s.getTelephone("sss","ddddd");

        IphoneFactory p=new IphoneFactory();
        p.getTelephone("ssdcds","sdsdcdscsd");
    }
}
