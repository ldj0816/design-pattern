package com.design.patterns.factory.factorymethod;


/**
 * 工厂方法模式 增加新的类  无需修改已有类  只增加新类即可  满足开闭原则  类的冗余和扩展增多
 */
public class Client01 {
    public static void main(String[] args) {
        Car car01 = new AudiFactory().createCar();
        Car car02 = new BydFactory().createCar();
        Car car03 = new BenchiFactory().createCar();
        car01.run();
        car02.run();
        car03.run();
    }
}
