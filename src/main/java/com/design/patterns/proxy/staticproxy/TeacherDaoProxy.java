package com.design.patterns.proxy.staticproxy;


/**
 * 教师代理类
 */
public class TeacherDaoProxy implements ITeacherDao {

    private ITeacherDao target;

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("静态代理开始。。。。。。。。");
        target.teach();
        System.out.println("静态代理结束。。。。。。。。");
    }
}
