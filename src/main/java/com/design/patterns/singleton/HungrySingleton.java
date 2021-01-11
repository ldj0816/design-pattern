package com.design.patterns.singleton;

/**
 * @author dj.lv
 * @title: HungrySingleton
 * @date 2019-07-31  14:50
 * @description: 饿汉式 天然的线程安全
 */
public class HungrySingleton {

    private static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getSingleton(){
        return hungrySingleton;
    }

}
