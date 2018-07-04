package com.wangs.designpatterns.factorypattern.factorymethodpattern;

public class SquareDesk implements DeskInterface {
    /**
     * 生产 方桌
     */
    @Override
    public void createDesk() {
        System.out.println("--------->方桌");
    }
}