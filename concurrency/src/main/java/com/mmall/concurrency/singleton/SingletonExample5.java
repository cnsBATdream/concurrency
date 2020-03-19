package com.mmall.concurrency.singleton;

import com.mmall.concurrency.annoations.NotThreadSafe;
import com.mmall.concurrency.annoations.ThreadSafe;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ThreadSafe
/**
 * 懒汉模式----双重同步锁单例模式
 * 单例的实例在第一次使用的时候创建
 */
public class SingletonExample5 {
    //私有构造函数
    private SingletonExample5(){

    }
    //单例对象
    private volatile static SingletonExample5 instance = null;
    //静态的工厂方法
    public static SingletonExample5 getInstance() {
        if (instance == null) {
            synchronized (SingletonExample5.class) {
                if(instance == null) {
                    instance = new SingletonExample5();
                }
            }
        }
        return instance;
    }




}
