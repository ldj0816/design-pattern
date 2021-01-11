package com.design.patterns.singleton;

/**
 * @author dj.lv
 * @title: DoubleCheckSingleton
 * @date 2019-07-31  16:55
 * @description: 双重校验锁 不推荐  偶尔出问题
 */
public class DoubleCheckSingleton {

    private volatile static DoubleCheckSingleton doubleCheckSingleton;

    private DoubleCheckSingleton(){}

    private static DoubleCheckSingleton getInstance(){
        if(doubleCheckSingleton==null){
            synchronized (DoubleCheckSingleton.class){
                if(doubleCheckSingleton==null){
                    doubleCheckSingleton = new DoubleCheckSingleton();
                }
            }
        }
        return doubleCheckSingleton;
    }

}
