package com.wangs.designpatterns.factorypattern.abstractfactorypattern;

/**
 * 运动系列女孩子
 */
public class SportsGilrClothing implements GirlClothing {
    @Override
    public void createGirlClothing() {
        System.out.println("-->>>>>>.运动系列女孩子");
    }
}
