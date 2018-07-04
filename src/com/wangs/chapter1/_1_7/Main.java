package com.wangs.chapter1._1_7;

public class Main {

    public static void main(String[] args) {
        doSomething(new Circle());
        doSomething(new Square());
        doSomething(new Shape());
    }

    public static void doSomething(Shape shape) {
        shape.erase();
        shape.draw();
    }
}
