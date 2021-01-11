package com.design.patterns.singleton;

/**
 * @author dj.lv
 * @title: StaticSingleton
 * @date 2019-07-31  17:13
 * @description: 静态内部类
 */
public class StaticSingleton {

    /**
     *  类级的内部类，也就是静态的成员式内部类，该内部类的实例与外部类的实例
     *  没有绑定关系，而且只有被调用到才会装载，从而实现了延迟加载
     */

    public StaticSingleton() {
    }

    private static class StaticHolder{
        private static StaticSingleton instance = new StaticSingleton();
    }

    public static StaticSingleton getInstance(){
        return StaticHolder.instance;
    }

}
