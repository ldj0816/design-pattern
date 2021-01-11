package com.design.patterns.decorator;

/**
 * @author dj.lv
 * @title: Milk
 * @date 2019/9/22  15:52
 * @description: 具体的调味品 巧克力
 */
public class Chocolate extends Decorator {

    public Chocolate(Drink drink) {
        super(drink);
        setDescription(" 巧克力 ");
        setPrice(3.0f);
    }
}
