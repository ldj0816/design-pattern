package com.design.patterns.factory.simple;

/**
 * 简答工厂情况下
 */
public class FactoryClient {
    public static void main(String[] args) {
        Car car01 = CarFactory.createCar("Audi");
        Car car02 = CarFactory.createCar("Byd");
        car01.run();
        car02.run();
    }
}
