package com.design.patterns.builder;


/**
 * 宇宙飞船构造器 接口
 */
public interface AirShipBuilder {

    Engine builderEngine();

    OrbitalModule builderOrbitalModule();

    EscapeTower builderEscapeTower();
}
