package com.design.patterns.factory.factorymethod;

public class BenchiFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Bechi();
    }
}
