package com.design.patterns.decorator;

/**
 * @author dj.lv
 * @title: Milk
 * @date 2019/9/22  15:52
 * @description: 具体的调味品 豆浆
 */
public class Soy extends Decorator {

    public Soy(Drink drink) {
        super(drink);
        setDescription(" 豆浆 ");
        setPrice(1.5f);
    }
}
