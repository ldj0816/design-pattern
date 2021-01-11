package com.design.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent {

    //Department
    List<OrganizationComponent> organizationComponentList = new ArrayList<>();

    //构造器
    public College(String name, String des) {
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
        System.out.println("------------"+getName());
        for (OrganizationComponent organizationComponent : organizationComponentList) {
            organizationComponent.print();
        }
    }

    //重写add
    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponentList.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponentList.remove(organizationComponent);
    }
}
