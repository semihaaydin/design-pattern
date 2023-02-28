package com.saydin.designpattern.singleton;

public class EagerInitializaionSingleton {

    private static final EagerInitializaionSingleton INSTANCE=new EagerInitializaionSingleton();

    private EagerInitializaionSingleton(){
        //singletion yaparken biz burayı private yaptık.
        // Böylece biri bu sınıfı new ile oluşturamaz. Yalnızca getInstance diyip kullanabilir.
    }

    public static EagerInitializaionSingleton getInstance(){
        return INSTANCE;
    }

    public void singletonTest(){
        System.out.println("Singletion method çalıştı!");
    }
}
