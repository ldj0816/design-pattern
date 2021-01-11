package com.design.patterns.decorator;

/**
 * @author dj.lv
 * @title: Decorator
 * @date 2019/9/22  15:50
 * @description: TODO
 */
public class Decorator extends Drink {

    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return super.getPrice()+drink.cost();
    }

    @Override
    public String getDescription() {
        //输出被装饰者的信息
        return super.getDescription()+" "+drink.getDescription() ;
    }
}
