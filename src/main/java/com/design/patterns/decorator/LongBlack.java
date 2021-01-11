package com.design.patterns.decorator;

/**
 * @author dj.lv
 * @title: Espresso
 * @date 2019/9/22  15:47
 * @description: TODO
 */
public class LongBlack extends Coffee {

    public LongBlack() {
        setDescription(" 美式咖啡 ");
        setPrice(5.0f);
    }

    @Override
    public float cost() {
        return super.cost();
    }
}
