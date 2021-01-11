package com.design.patterns.proxy.dynamic;

/**
 * 教师接口实现  （即将被代理的类）
 */
public class TeacherDao implements ITeacherDao {

    @Override
    public void teach() {
        System.out.println("老师讲课中");
    }
}
