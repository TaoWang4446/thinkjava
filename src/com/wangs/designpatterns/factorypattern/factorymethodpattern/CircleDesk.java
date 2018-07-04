package com.wangs.designpatterns.factorypattern.factorymethodpattern;

/**
 * 圆桌
 */
public class CircleDesk implements DeskInterface {
    /**
     * 生产 圆桌
     */
    @Override
    public void createDesk() {
        System.out.println("--------->圆桌");
    }
}
