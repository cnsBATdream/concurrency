package com.mmall.concurrency.singleton;

import com.mmall.concurrency.annoations.NotThreadSafe;
import com.mmall.concurrency.annoations.ThreadSafe;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ThreadSafe
/**
 * 饿汉模式
 * 单例的实例在类装载的时候创建
 */
public class SingletonExample2 {
    //私有构造函数
    private SingletonExample2(){

    }
    //单例对象
    private static SingletonExample2 instance = new SingletonExample2();
    //静态的工厂方法
    public static SingletonExample2 getInstance() {
        if (instance == null) {
            instance  = new SingletonExample2();
        }
        return instance;
    }



}
