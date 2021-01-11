package com.design.patterns.prototype;


import java.util.Date;

/**
 * 原型模式 （浅复制）
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date(12312312321L);
        Sheep sheep = new Sheep("大多利",date);
        Sheep sheep1 = (Sheep) sheep.clone();
        System.out.println(sheep);
        System.out.println(sheep.getSname());
        System.out.println(sheep.getBirthday());
        date.setTime(2342425345234L);
        System.out.println(sheep.getBirthday());
        System.out.println(sheep1);
        sheep1.setSname("多利");
        System.out.println(sheep1.getSname());
        System.out.println(sheep1.getBirthday());
    }
}
