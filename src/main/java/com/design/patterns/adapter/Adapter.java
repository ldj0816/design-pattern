package com.design.patterns.adapter;


/**
 * 适配器
 * （相当于 usb和ps/2的转接头）
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void handerRequest() {
        adaptee.request();
    }
}
