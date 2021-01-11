package com.design.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Department extends OrganizationComponent {

    //构造器
    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }


}
