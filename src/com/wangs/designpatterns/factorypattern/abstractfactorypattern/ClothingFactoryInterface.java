package com.wangs.designpatterns.factorypattern.abstractfactorypattern;

/**
 * 服装工厂 接口
 */
public interface ClothingFactoryInterface {
    //男装接口
    public BoyClothing getBoy();
    //女装接口
    public GirlClothing getGirl();
}
