package com.design.patterns.builder;

/**
 * 宇宙飞船 实体类
 */
public class AirShip {

    private Engine engine;

    private EscapeTower escapeTower;

    private OrbitalModule orbitalModule;

    public AirShip(Engine engine, EscapeTower escapeTower, OrbitalModule orbitalModule) {
        this.engine = engine;
        this.escapeTower = escapeTower;
        this.orbitalModule = orbitalModule;
    }

    public void Lunch(){
        System.out.println("发射！！！");
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public EscapeTower getEscapeTower() {
        return escapeTower;
    }

    public void setEscapeTower(EscapeTower escapeTower) {
        this.escapeTower = escapeTower;
    }

    public OrbitalModule getOrbitalModule() {
        return orbitalModule;
    }

    public void setOrbitalModule(OrbitalModule orbitalModule) {
        this.orbitalModule = orbitalModule;
    }
}
