package com.design.patterns.decorator;

/**
 * @author dj.lv
 * @title: Coffee
 * @date 2019/9/22  15:46
 * @description: TODO
 */
public class Coffee extends Drink {

    @Override
    public float cost() {
        return super.getPrice();
    }
}
