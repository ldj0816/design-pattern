package com.design.patterns.facade;

/**
 * 外观模式封装类
 */
public class HomeTheaterFacade {

    private DVDPlayer dvdPlayer;
    private Popcorn popcorn;
    private Stereo stereo;

    public HomeTheaterFacade() {
        this.dvdPlayer = DVDPlayer.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.stereo = Stereo.getInstance();
    }

    /**
     * 准备工作
     */
    public void ready(){
        popcorn.on();
        popcorn.pop();
        dvdPlayer.on();
        stereo.on();
    }

    /**
     * 开始播放
     */
    public void play(){
        dvdPlayer.play();
    }

    /**
     * 暂停
     */
    public void pause(){
        dvdPlayer.pause();
    }

    /**
     * 结束
     */
    public void end(){
        popcorn.off();
        dvdPlayer.off();
        stereo.off();
    }
}
