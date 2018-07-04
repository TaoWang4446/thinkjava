package com.wangs.designpatterns.singletonpattern.lazypattern;

public class ThreadTest implements Runnable {

    @Override
    public void run() {
        SingletonSecurity singleton = SingletonSecurity.getInstance();
        System.out.println(singleton);
    }
}
