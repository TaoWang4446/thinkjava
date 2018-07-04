package com.wangs.designpatterns.factorypattern.factorymethodpattern;

/**
 * 模拟客户端的实现
 */
public class DeskCreateTest {
    public static void main(String[] args) {
        /*DeskInterface circleDesk = new CircleDesk();
        circleDesk.createDesk();*/

        /*DeskFactory deskFactory = new DeskFactory();
        DeskInterface deskInterface = deskFactory.getDesk("circle");
        deskInterface.createDesk();*/

        /*DeskFactory deskFactory = new DeskFactory();
        DeskInterface deskInterface = null;
        try {
            deskInterface = deskFactory.getDeskByClass("com.wangs.factorypattern.factorymethodpattern.CircleDesk");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        deskInterface.createDesk();*/

        DeskFactory deskFactory = new DeskFactory();
        DeskInterface deskInterface = null;
        try {
            deskInterface = deskFactory.getDeskByClass("circleDesk");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        deskInterface.createDesk();
    }
}
