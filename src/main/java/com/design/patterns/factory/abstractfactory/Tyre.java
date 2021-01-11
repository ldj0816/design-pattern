package com.design.patterns.factory.abstractfactory;

public interface Tyre {
    void revolve();
}

class LuxuryTyre implements Tyre{

    @Override
    public void revolve() {
        System.out.println("旋转耐磨");
    }
}


class LowTyre implements Tyre{

    @Override
    public void revolve() {
        System.out.println("不耐磨");
    }
}