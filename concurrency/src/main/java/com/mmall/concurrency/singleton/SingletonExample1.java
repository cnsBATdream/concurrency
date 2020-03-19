package com.mmall.concurrency.singleton;

import com.mmall.concurrency.annoations.NotThreadSafe;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NotThreadSafe
/**
 * 懒汉模式
 * 单例的实例在第一次使用的时候创建
 */
public class SingletonExample1 {
    //私有构造函数
    private SingletonExample1(){

    }
    //单例对象
    private static SingletonExample1 instance = null;
    //静态的工厂方法
    public static SingletonExample1 getInstance() {
        if (instance == null) {
            instance  = new SingletonExample1();
        }
        return instance;
    }




}
