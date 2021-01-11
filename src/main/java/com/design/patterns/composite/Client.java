package com.design.patterns.composite;

public class Client {

    public static void main(String[] args) {
        OrganizationComponent university = new University("清华大学", "中国顶级大学");
        OrganizationComponent computer = new College("计算机学院", "计算机学院");
        OrganizationComponent infoRngineer = new College("信息工程学院", "信息工程学院");
        computer.add(new Department("软件工程","软件工程不错"));
        computer.add(new Department("网络工程","网络工程不错"));
        computer.add(new Department("计算机科学与技术","计算机科学与技术不错"));
        infoRngineer.add(new Department("通信工程","通信工程好学"));
        infoRngineer.add(new Department("信息工程","信息工程好学"));
        university.add(computer);
        university.add(infoRngineer);

        university.print();
    }
}
