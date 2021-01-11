package com.design.patterns.singleton;

/**
 * @author dj.lv
 * @title: EnumSingleton
 * @date 2019-07-31  17:06
 * @description: 枚举单例  线程安全，调用效率高，不能延时加载，可以天然的防止反射和反序列化调用
 */
public enum  EnumSingleton {
    instance;
    private EnumSingleton(){
        System.out.println("初始化  init");
    }

    public void testPrint(){
        System.out.println("aaa");
    }

    public static void main(String[] args) {
        //只打印一次构造
        EnumSingleton enumSingleton = EnumSingleton.instance;
        enumSingleton.testPrint();

        EnumSingleton enumSingleton2 = EnumSingleton.instance;
        enumSingleton2.testPrint();
    }

}
