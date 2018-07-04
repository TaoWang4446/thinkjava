package com.wangs.designpatterns.factorypattern.abstractfactorypattern;

/**
 * 运动系列男装
 */
public class SportsBoyClothing implements BoyClothing {
    @Override
    public void createBoyClothing() {
        System.out.println("->>>>>>>>>>>>>>>>>>>生成运动男衣服");
    }
}
