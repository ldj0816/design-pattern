package com.design.patterns.proxy.cglib;



/**
 * 静态测试类
 */
public class Client {

    public static void main(String[] args) {
        TeacherDao  teacherDao = new TeacherDao();
        ProxyFactory proxyFactory = new ProxyFactory(teacherDao);
        TeacherDao proxyInstance = (TeacherDao)proxyFactory.getProxyInstance(teacherDao);
        String result= proxyInstance.teach();
        System.out.println(result);
    }
}
