package com.design.patterns.prototype;

import java.util.Date;

/**
 * 原型模式 （深复制）
 */
public class Sheep2 implements Cloneable {

    private String sname;

    private Date birthday;

    public Sheep2(String sname, Date birthday) {
        this.sname = sname;
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();
        Sheep2 sheep2 = (Sheep2)obj;
        sheep2.birthday = (Date) this.birthday.clone();
        return sheep2;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
