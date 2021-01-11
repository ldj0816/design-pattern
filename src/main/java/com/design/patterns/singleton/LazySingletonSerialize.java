package com.design.patterns.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @author dj.lv
 * @title: LazySingleton
 * @date 2019-07-31  14:49
 * @description: 懒汉式序列化
 */
public class LazySingletonSerialize implements Serializable {

    //比较懒，在类加载时，不创建实例，因此类加载速度快，但运行时获取对象的速度慢
    private static LazySingletonSerialize lazySingleton;

    private LazySingletonSerialize(){}

    public static synchronized LazySingletonSerialize getInstance(){
        if(lazySingleton==null){
            lazySingleton =  new LazySingletonSerialize();
        }
        return lazySingleton;
    }

    //反序列化时，如果定义了readResolve 则直接返回此方法定义的对象，无需创建新的对象
    private Object readResolve() throws ObjectStreamException {
        return lazySingleton;
    }

}


