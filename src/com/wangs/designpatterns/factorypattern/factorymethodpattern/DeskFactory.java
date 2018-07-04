package com.wangs.designpatterns.factorypattern.factorymethodpattern;

import java.util.Map;

/**
 * 桌子工厂
 */
public class DeskFactory {

    /**
     * 根据 类型 创建桌子
     * @param key
     * @return
     */
    public DeskInterface getDesk(String key){
        if("circle".equals(key)){
            return new CircleDesk();
        }else if("square".equals(key)){
            return new SquareDesk();
        }
        return null;
    }

    /**
     * 根据 全类名 创建桌子
     * @param className
     * @return
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public DeskInterface getDeskByClass(String className) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        Map<String,String> map = new PropertiesReadUtil().getProperties();

        DeskInterface deskInterfaceeskInterface = (DeskInterface) Class.forName(map.get(className)).newInstance();
        return deskInterfaceeskInterface;
    }
}
