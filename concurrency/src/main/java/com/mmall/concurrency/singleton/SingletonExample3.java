package com.mmall.concurrency.singleton;

import com.mmall.concurrency.annoations.NotRecommend;
import com.mmall.concurrency.annoations.NotThreadSafe;
import com.mmall.concurrency.annoations.ThreadSafe;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ThreadSafe
@NotRecommend
/**
 * 懒汉模式
 * 单例的实例在第一次使用的时候创建
 */
public class SingletonExample3 {
    //私有构造函数
    private SingletonExample3(){

    }
    //单例对象
    private static SingletonExample3 instance = null;
    //静态的工厂方法
    public static synchronized SingletonExample3 getInstance() {
        if (instance == null) {
            instance  = new SingletonExample3();
        }
        return instance;
    }




}
