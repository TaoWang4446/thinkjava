package com.wangs.designpatterns.singletonpattern.lazypattern;

/**
 * 单例模式
 * 使用场景 有些对象是需要一个就够了:比如皇帝 老婆
 * 作用: 保证应用程序中 某个 实例 有且只有一个
 * 类型: 恶汉模式 懒汉模式
 */
public class SingletonSecurity {
    //1. 将构造方法私有化 不允许 外部直接创建对象
    private SingletonSecurity(){
        System.out.println("建立新的对象");
    }

    //2. 创建类的唯一实例 private static 类的静态成员变量
    private static SingletonSecurity instance;

    //3. 通过一个公有的静态方法返回实例对象 给外部访问
    public static SingletonSecurity getInstance(){
        /*synchronized (SingletonSecurity.class){
            if (null == instance){
                instance = new SingletonSecurity();
            }
        }*/

        /*
         * 如果第一个线程获取到了单例的实例对象， 后面的线程再获取实例的时候不需要进入同步代码块中了
         */
       /* if (instance == null) {
            // 同步代码块用的锁是单例的字节码文件对象，且只能用这个锁
            synchronized (SingletonSecurity.class) {
                if (instance == null) {
                    instance = new SingletonSecurity();
                }
            }
        }*/

        // 同步代码块用的锁是单例的字节码文件对象，且只能用这个锁
        synchronized (SingletonSecurity.class) {
            if (instance == null) {
                instance = new SingletonSecurity();
            }
        }
        return instance;
    }

}
