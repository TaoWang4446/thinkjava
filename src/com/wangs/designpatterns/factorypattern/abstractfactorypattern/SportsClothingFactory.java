package com.wangs.designpatterns.factorypattern.abstractfactorypattern;

/**
 * 运动男装系列 工厂
 */
public class SportsClothingFactory implements ClothingFactoryInterface {
    @Override
    public BoyClothing getBoy() {
        return new SportsBoyClothing();
    }

    @Override
    public GirlClothing getGirl() {
        return new SportsGilrClothing();
    }
}
