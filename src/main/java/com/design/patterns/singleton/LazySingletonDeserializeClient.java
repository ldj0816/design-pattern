package com.design.patterns.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author dj.lv
 * @title: LazySingleton
 * @date 2019-07-31  14:49
 * @description: 懒汉式单例反射
 */
public class LazySingletonDeserializeClient {

    public static void main(String[] args) {
        try {
            LazySingletonSerialize lazySingleton = LazySingletonSerialize.getInstance();
            FileOutputStream fos = new FileOutputStream("d:/a.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(lazySingleton);
            oos.close();
            fos.close();
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/a.txt"));
            LazySingletonSerialize lazy2 = (LazySingletonSerialize)ois.readObject();
            System.out.println(lazy2);
            System.out.println(lazySingleton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}


