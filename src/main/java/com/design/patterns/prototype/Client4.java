package com.design.patterns.prototype;



/**
 * 测试new 创建对象和clone创建对象的效率差异
 * 若创建对象繁琐耗时或短时间创建大量对象则用原型模式
 */
public class Client4 {

    public static void test1(int size){
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            Laptop laptop = new Laptop();
        }
        long end = System.currentTimeMillis();
        System.out.println("new 创建对象耗时："+(end-start));
    }

    public static void test2(int size) throws CloneNotSupportedException {
        long start = System.currentTimeMillis();
        Laptop t = new Laptop();
        for (int i = 0; i < size; i++) {
            Laptop temp = (Laptop)t.clone();
        }
        long end = System.currentTimeMillis();
        System.out.println("clone 创建对象耗时："+(end-start));
    }


    public static void main(String[] args) throws CloneNotSupportedException{
        test1(1000);
        test2(1000);
    }
}
