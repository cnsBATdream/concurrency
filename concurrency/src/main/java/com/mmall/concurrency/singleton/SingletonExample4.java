package com.mmall.concurrency.singleton;

import com.mmall.concurrency.annoations.NotThreadSafe;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NotThreadSafe
/**
 * 懒汉模式----双重同步锁单例模式
 * 单例的实例在第一次使用的时候创建
 */
public class SingletonExample4 {
    //私有构造函数
    private SingletonExample4(){

    }
    //单例对象
    private static SingletonExample4 instance = null;
    //静态的工厂方法
    public static SingletonExample4 getInstance() {
        if (instance == null) {
            synchronized (SingletonExample4.class) {
                if(instance == null) {
                    instance = new SingletonExample4();
                }
            }
        }
        return instance;
    }




}
