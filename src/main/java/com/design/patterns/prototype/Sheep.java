package com.design.patterns.prototype;

import java.io.Serializable;
import java.util.Date;

/**
 * 原型模式 （浅复制）
 */
public class Sheep implements Cloneable, Serializable {

    private String sname;

    private Date birthday;

    public Sheep(String sname, Date birthday) {
        this.sname = sname;
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
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
