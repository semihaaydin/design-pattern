package com.saydin.designpattern.singleton;

public class ThreadSafeSingletion {
    private static ThreadSafeSingletion threadSafeSingletion;

    private ThreadSafeSingletion(){

    }
    public static ThreadSafeSingletion getThreadSafeSingletion(){
            synchronized (ThreadSafeSingletion.class){
                if (threadSafeSingletion==null){
                    threadSafeSingletion = new ThreadSafeSingletion();
                }
            }
        return threadSafeSingletion;
        }

    public void singletonTest(){
        System.out.println("Singletion method çalıştı!");
    }

}
