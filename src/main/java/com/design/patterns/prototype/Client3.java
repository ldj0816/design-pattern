package com.design.patterns.prototype;


import java.io.*;
import java.util.Date;

/**
 * 原型模式 （使用反序列化实现深复制）
 */
public class Client3 {

    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Date date = new Date(12312312321L);
        Sheep sheep = new Sheep("大多利",date);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(sheep);
        byte[] bytes = bos.toByteArray();
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Sheep sheep1 = (Sheep) ois.readObject();

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
