package com.wangs.designpatterns.singletonpattern.lazypattern;

public class TestMulThreadSecrity {
    public static void main(String[] args) {

        new Thread(new ThreadTest()).start();
        new Thread(new ThreadTest()).start();
        new Thread(new ThreadTest()).start();
        new Thread(new ThreadTest()).start();
        new Thread(new ThreadTest()).start();
        new Thread(new ThreadTest()).start();




    }
}
