package com.thread;

/**
 * @author dj.lv
 * @title: ThreadSoldier
 * @date 2019-08-14  10:04
 * @description: TODO
 */
public class ThreadSoldier {

     int bulletCount;
     boolean flag = false;

    public synchronized void loading(){
        try {
            while (bulletCount==20){
                System.out.println("子弹装满，无法继续装弹");
                wait();
            }
            bulletCount++;
            System.out.println("开始装弹 "+bulletCount);
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void shooting(){
        try {
            while (bulletCount==0){
                System.out.println("没子弹了，无法射击");
                wait();
            }
            bulletCount--;
            System.out.println("有子弹了，开始射击 "+bulletCount);
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }



}
