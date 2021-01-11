package com.design.patterns.builder;

public class Client {

    public static void main(String[] args) {
        AirShipDirector airShipDirector = new LdjAirShipDirector(new LdjAirShipBuilder());

        AirShip airShip = airShipDirector.directorAirShip();
        airShip.Lunch();
        //System.out.println(airShip.getEngine().getName());
    }
}
