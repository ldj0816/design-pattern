package com.design.patterns.factory.simple;

/**
 * 简单工厂  违反开闭原则
 */

public class CarFactory {

    public static Car createCar(String type){
        if("Audi".equals(type)){
            return new Audi();
        } else if("Byd".equals(type)){
            return new Byd();
        } else {
            return null;
        }
    }
}
