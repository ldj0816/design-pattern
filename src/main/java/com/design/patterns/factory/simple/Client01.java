package com.design.patterns.factory.simple;

/**
 * 无工厂情况下
 */
public class Client01 {
    public static void main(String[] args) {
        Car car01 = new Audi();
        Car car02 = new Byd();
        car01.run();
        car02.run();
    }
}
