package com.saydin.designpattern.singleton;

public class LazyInitializationSingletion {

    //bu method threadsafe değildir. Birden fazla thread ile gelirse lack olma ihtimali daha yüksektir.
    //runtime exception ile karşılaşırız.
    private static LazyInitializationSingletion lazyInitializationSingletion;

    private LazyInitializationSingletion(){}


    public static LazyInitializationSingletion getLazyInitializationSingletion(){
        if (lazyInitializationSingletion==null)
            lazyInitializationSingletion = new LazyInitializationSingletion();
        return lazyInitializationSingletion;
    }

    public void singletonTest(){
        System.out.println("Singletion method çalıştı!");
    }
}
