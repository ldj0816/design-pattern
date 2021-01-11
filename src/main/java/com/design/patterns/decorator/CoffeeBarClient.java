package com.design.patterns.decorator;

/**
 * @author dj.lv
 * @title: CoffeeBarClient
 * @date 2019/9/22  15:57
 * @description:  测试类  咖啡店
 */
public class CoffeeBarClient {

    public static void main(String[] args) {
        //装饰者模式下的订单  2份巧克力+1份牛奶的LongBlack

        //1. 点一份LongBlack
        Drink order = new LongBlack();
        System.out.println("费用1= "+ order.cost());
        System.out.println("描述= "+ order.getDescription());

        //2. 加入一份牛奶
        order = new Milk(order);
        System.out.println("order 加入一份牛奶= "+ order.cost());
        System.out.println("order 加入一份牛奶= "+ order.getDescription());

        //3. 加入一份巧克力
        order = new Chocolate(order);
        System.out.println("order 加入一份牛奶 再加入一份巧克力 = "+ order.cost());
        System.out.println("order 加入一份牛奶 再加入一份巧克力 = "+ order.getDescription());

        //4. 再加入一份牛奶
        order = new Chocolate(order);
        System.out.println("order 加入2份牛奶 再加入一份巧克力 = "+ order.cost());
        System.out.println("order 加入2份牛奶 再加入一份巧克力 = "+ order.getDescription());

    }
}
