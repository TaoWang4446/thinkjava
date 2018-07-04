package com.wangs.designpatterns.factorypattern.abstractfactorypattern;

public class MainTest {
    public static void main(String[] args) {
        ClothingFactoryInterface leisureClothingFactory = new LeisureClothingFactory();
        BoyClothing boyClothing = leisureClothingFactory.getBoy();
        boyClothing.createBoyClothing();

        ClothingFactoryInterface sportsClothingFactory = new SportsClothingFactory();
        GirlClothing girlClothing = sportsClothingFactory.getGirl();
        girlClothing.createGirlClothing();
    }
}
