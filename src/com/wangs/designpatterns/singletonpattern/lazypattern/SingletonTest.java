package com.wangs.designpatterns.singletonpattern.lazypattern;

public class SingletonTest {
    public static void main(String[] args) {
        //new Singleton();
        /*Singleton instance1 = Singleton.instance;
        Singleton instance2 = Singleton.instance;*/

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        if(instance1 == instance2){
            System.out.println("两个实例相同");
        }else{
            System.out.println("两个实例不相同");
        }
    }
}
