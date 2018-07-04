package com.wangs.designpatterns.factorypattern.factorymethodpattern;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 属性文件读取工具类
 */
public class PropertiesReadUtil {
    public Map<String, String> getProperties(){
        Properties properties = new Properties();
        Map<String, String> map = new HashMap<String, String>();
        try{
            InputStream in = getClass().getResourceAsStream("type.properties");
            properties.load(in);
            Enumeration en = properties.propertyNames();
            while (en.hasMoreElements()){
                String key = (String) en.nextElement();
                String value = properties.getProperty(key);
                map.put(key,value);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return  map;
    }
}
