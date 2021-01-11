package com.design.patterns.decorator;

/**
 * @author dj.lv
 * @title: Milk
 * @date 2019/9/22  15:52
 * @description: 具体的调味品 牛奶
 */
public class Milk extends Decorator {

    public Milk(Drink drink) {
        super(drink);
        setDescription(" 牛奶 ");
        setPrice(2.0f);
    }
}
