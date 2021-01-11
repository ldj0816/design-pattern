package com.design.patterns.prototype;


import java.util.Date;

/**
 * 原型模式 （深复制）
 */
public class Client2 {

    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date(12312312321L);
        Sheep2 sheep = new Sheep2("大多利",date);
        Sheep2 sheep1 = (Sheep2) sheep.clone();
        System.out.println(sheep);
        System.out.println(sheep.getSname());
        System.out.println(sheep.getBirthday());
        date.setTime(2342425345234L);

        System.out.println(sheep.getBirthday());
        System.out.println(sheep1);

        System.out.println(sheep1.getSname());
        System.out.println(sheep1.getBirthday());
    }
}
