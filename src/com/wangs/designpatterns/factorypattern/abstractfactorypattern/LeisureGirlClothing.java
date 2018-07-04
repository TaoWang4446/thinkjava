package com.wangs.designpatterns.factorypattern.abstractfactorypattern;

/**
 * 休闲 女孩装
 */
public class LeisureGirlClothing implements GirlClothing {
    @Override
    public void createGirlClothing() {
        System.out.println("->>>>>>>>>>>>生成休闲女衣服");
    }
}
