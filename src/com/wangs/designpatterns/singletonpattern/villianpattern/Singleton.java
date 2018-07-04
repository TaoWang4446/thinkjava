package com.wangs.designpatterns.singletonpattern.villianpattern;

/**
 * 单例模式
 * 使用场景 有些对象是需要一个就够了:比如皇帝 老婆
 * 作用: 保证应用程序中 某个 实例 有且只有一个
 * 类型: 恶汉模式 懒汉模式
 */
public class Singleton {
    //1. 将构造方法私有化 不允许 外部直接创建对象
    private Singleton(){}

    //2. 创建类的唯一实例 private static 类的静态成员变量
    private static Singleton instance = new Singleton();

    //3. 通过一个公有的静态方法返回实例对象 给外部访问
    public static Singleton getInstance(){
        return instance;
    }

}
