package com.design.patterns.decorator;

/**
 * @author dj.lv
 * @title: Drink
 * @date 2019/9/22  15:44
 * @description: 饮品抽象类
 */
public abstract class Drink {

    /**
     * 描述
     */
    public String description;

    private float price=0.0f;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * 计算费用 子类实现
     * @return
     */
    public abstract float cost();
}
