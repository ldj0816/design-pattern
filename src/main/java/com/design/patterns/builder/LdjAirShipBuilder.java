package com.design.patterns.builder;


public class LdjAirShipBuilder implements AirShipBuilder {

    @Override
    public Engine builderEngine() {
        System.out.println("构造宇宙飞船的发动机");
        return new Engine("宇宙飞船发动机");
    }

    @Override
    public OrbitalModule builderOrbitalModule() {
        System.out.println("构造宇宙飞船轨道舱！！");
        return new OrbitalModule("宇宙飞船轨道舱");
    }

    @Override
    public EscapeTower builderEscapeTower() {
        System.out.println("构造宇宙飞船逃逸仓");
        return new EscapeTower("宇宙飞船逃逸仓");
    }
}
