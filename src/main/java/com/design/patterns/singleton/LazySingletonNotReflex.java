package com.design.patterns.singleton;

/**
 * @author dj.lv
 * @title: LazySingleton
 * @date 2019-07-31  14:49
 * @description: 懒汉式
 */
public class LazySingletonNotReflex {

    //比较懒，在类加载时，不创建实例，因此类加载速度快，但运行时获取对象的速度慢
    private static LazySingletonNotReflex lazySingleton;

    private LazySingletonNotReflex(){
        if(lazySingleton!=null){
            throw new RuntimeException("对象已存在");
        }
    }

    public static synchronized LazySingletonNotReflex getInstance(){
        if(lazySingleton==null){
            lazySingleton =  new LazySingletonNotReflex();
        }
        return lazySingleton;
    }

}


