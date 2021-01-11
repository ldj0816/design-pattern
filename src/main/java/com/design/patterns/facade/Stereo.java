package com.design.patterns.facade;

public class Stereo {

    private static Stereo instance = new Stereo();

    public static Stereo getInstance() {
        return instance;
    }

    public void on(){
        System.out.println(" DVDPlayer on ");
    }

    public void off(){
        System.out.println(" DVDPlayer off ");
    }

}
