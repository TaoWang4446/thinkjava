package com.wangs.designpatterns.factorypattern.abstractfactorypattern;

/**
 * 休闲服装 工厂
 */
public class LeisureClothingFactory implements ClothingFactoryInterface {
    @Override
    public BoyClothing getBoy() {
        return new LeisureBoyClothing();
    }

    @Override
    public GirlClothing getGirl() {
        return new LeisureGirlClothing();
    }
}
