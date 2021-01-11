package com.design.patterns.proxy.cglib;


/**
 * 教师接口实现  （即将被代理的类）
 */
public class TeacherDao {

    public String teach() {
        System.out.println("老师讲课中");
        return "好好学习";
    }
}
