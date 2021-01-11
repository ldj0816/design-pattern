package com.design.patterns.proxy.dynamic;


/**
 * 静态测试类
 */
public class Client {

    public static void main(String[] args) {
        ITeacherDao  teacherDao = new TeacherDao();
        ProxyFactory proxyFactory = new ProxyFactory(teacherDao);
        ITeacherDao proxyInstance = (ITeacherDao)proxyFactory.getProxyInstance(teacherDao);
        proxyInstance.teach();
    }
}
