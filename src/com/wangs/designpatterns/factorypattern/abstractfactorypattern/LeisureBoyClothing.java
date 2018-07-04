package com.wangs.designpatterns.factorypattern.abstractfactorypattern;

/**
 * 休闲男装
 */
public class LeisureBoyClothing implements BoyClothing {
    @Override
    public void createBoyClothing() {
        System.out.println("-....>>>>>>>>>休闲男孩子装");
    }
}
