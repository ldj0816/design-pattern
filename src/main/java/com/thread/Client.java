package com.thread;

/**
 * @author dj.lv
 * @title: Client
 * @date 2019-08-14  10:18
 * @description: TODO
 */
public class Client {

    public static void main(String[] args) {
        ThreadSoldier soldier = new ThreadSoldier();
        Thread shotting = new ThreadShotting(soldier);
        shotting.start();
        Thread loading = new ThreadLoading(soldier);
        loading.start();
    }
}
