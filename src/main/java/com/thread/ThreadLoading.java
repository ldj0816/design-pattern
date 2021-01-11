package com.thread;

import java.util.concurrent.TimeUnit;

/**
 * @author dj.lv
 * @title: ThreadLoading
 * @date 2019-08-14  9:57
 * @description: TODO
 */
public class ThreadLoading extends Thread{

    private ThreadSoldier threadSoldier;

    public ThreadLoading(ThreadSoldier threadSoldier) {
        this.threadSoldier = threadSoldier;
    }

    @Override
    public void run() {
        while (true) {
            try {
                threadSoldier.loading();
                Thread.currentThread().sleep(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
