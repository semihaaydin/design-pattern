package com.saydin.designpattern.singleton;

public class Run {

    public static void main(String[] args) {
        //EagerInitializaionSingleton e=new EagerInitializaionSingleton();
        //Yukarıdaki gibi new ile bu sınıfı oluşturamayız.

        EagerInitializaionSingleton.getInstance().singletonTest();
        StaticBlockSingleton.getStaticBlockSingleton().singletonTest();
        LazyInitializationSingletion.getLazyInitializationSingletion().singletonTest();
        ThreadSafeSingletion.getThreadSafeSingletion().singletonTest();
    }
}
