package com.saydin.designpattern.singleton;

public class StaticBlockSingleton {

    private static StaticBlockSingleton staticBlockSingleton;

    private StaticBlockSingleton(){

    }

    static {
        try {
            staticBlockSingleton = new StaticBlockSingleton();
        }catch (Exception e){

        }
    }
    public static StaticBlockSingleton getStaticBlockSingleton(){
        return staticBlockSingleton;
    }

    public void singletonTest(){
        System.out.println("Singletion method çalıştı!");
    }



}
