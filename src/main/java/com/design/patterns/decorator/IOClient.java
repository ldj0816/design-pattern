package com.design.patterns.decorator;

import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 * @author dj.lv
 * @title: IOClient
 * @date 2019/9/22  16:05
 * @description: 装饰者模式 IO 源码应用
 */
public class IOClient {

    public static void main(String[] args) throws Exception {

        //说明：
        //1、InputStream是抽象类 ，类似前面的Drink
        //2、FileInputStream 是InputStream的子类 类似前面的DeCaf,LongBlack
        //3、FilterInputStream 是InputStream的子类 类似前面的Decorator 修饰者
        //4、DataInputStream 是FilterInputStream 的子类 具体的修饰者 类似Soy
        //5、FilterInputStream 类有protected volatile InputStream in 即被修饰者

        DataInputStream dis = new DataInputStream(new FileInputStream("d://abc.txt"));
        System.out.println(dis.read());
        dis.close();
    }
}
