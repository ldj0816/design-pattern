package com.design.patterns.singleton;

/**
 * @author dj.lv
 * @title: LazySingleton
 * @date 2019-07-31  14:49
 * @description: 懒汉式
 */
public class LazySingleton {

    //比较懒，在类加载时，不创建实例，因此类加载速度快，但运行时获取对象的速度慢
    private static LazySingleton lazySingleton;

    private LazySingleton (){}

    public static synchronized LazySingleton getInstance(){
        if(lazySingleton==null){
            lazySingleton =  new LazySingleton();
        }
        return lazySingleton;
    }

}


