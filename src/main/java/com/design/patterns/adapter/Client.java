package com.design.patterns.adapter;


/**
 * 客户端类
 */
public class Client {

    public void test1(Target t){
        t.handerRequest();
    }

    public static void main(String[] args) {
        Client client = new Client();
        Adaptee adaptee = new Adaptee();

        Target t = new Adapter(adaptee);
        client.test1(t);


    }


}
