package com.thread;

/**
 * @author dj.lv
 * @title: ThreadLoading
 * @date 2019-08-14  9:57
 * @description: TODO
 */
public class ThreadShotting extends Thread {

    private ThreadSoldier threadSoldier;

    public ThreadShotting(ThreadSoldier threadSoldier) {
        this.threadSoldier = threadSoldier;
    }

    @Override
    public void run() {
        while (true) {
            threadSoldier.shooting();
            try {
                Thread.currentThread().sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
