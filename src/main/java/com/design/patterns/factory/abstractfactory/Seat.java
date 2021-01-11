package com.design.patterns.factory.abstractfactory;

public interface Seat {
    void massage();
}

class LuxurySeat implements Seat{

    @Override
    public void massage() {
        System.out.println("可自动按摩");
    }
}

class LowSeat implements Seat{

    @Override
    public void massage() {
        System.out.println("不可自动按摩");
    }
}