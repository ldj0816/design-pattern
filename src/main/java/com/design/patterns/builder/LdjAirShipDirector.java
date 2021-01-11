package com.design.patterns.builder;

/**
 * 宇宙飞船装配器
 */
public class LdjAirShipDirector implements AirShipDirector{
    private LdjAirShipBuilder builder;

    public LdjAirShipDirector(LdjAirShipBuilder builder) {
        this.builder = builder;
    }


    @Override
    public AirShip directorAirShip() {
        return new AirShip(builder.builderEngine(),builder.builderEscapeTower(),builder.builderOrbitalModule());
    }
}
