package com.design.patterns.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author dj.lv
 * @title: LazySingleton
 * @date 2019-07-31  14:49
 * @description: 懒汉式单例反射
 */
public class LazySingletonReflexClient {

    public static void main(String[] args) {

        try {
            Class<LazySingleton> clazz = (Class<LazySingleton>)Class.forName("com.design.patterns.singleton.LazySingleton");
            Constructor<LazySingleton> constructor = clazz.getDeclaredConstructor(null);
            constructor.setAccessible(true);
            LazySingleton lazySingleton1 = constructor.newInstance();
            LazySingleton lazySingleton2 = constructor.newInstance();
            System.out.println(lazySingleton1);
            System.out.println(lazySingleton2);

            Class<LazySingletonNotReflex> lclazz = (Class<LazySingletonNotReflex>)Class.forName("com.design.patterns.singleton.LazySingleton");
            Constructor<LazySingletonNotReflex> declaredConstructor = lclazz.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            LazySingletonNotReflex lazySingletonNotReflex = declaredConstructor.newInstance();
            LazySingletonNotReflex lazySingletonNotReflex1 = declaredConstructor.newInstance();
            System.out.println(lazySingletonNotReflex);
            System.out.println(lazySingletonNotReflex1);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

}


