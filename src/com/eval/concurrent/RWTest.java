package com.eval.concurrent;

import java.util.Random;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by evalcony on 2017/12/25.
 */
public class RWTest {

    public static void main(String[] args) {
        final Data data = new Data();
        for (int i = 0; i < 3; i++) {
            new Thread(new Runnable() {
                public void run() {
                    for (int j = 0; j < 5; j++) {
                        data.set(new Random().nextInt(30));
                    }
                }
            }).start();
        }
        for (int i = 0; i < 3; i++) {
            new Thread(new Runnable() {
                public void run() {
                    for (int j = 0; j < 5; j++) {
                        data.get();
                    }
                }
            }).start();
        }
    }

    static class Data {
        private ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        private int data;// 共享数据
        public void set(int data) {
            readWriteLock.writeLock().lock();
            try {
                System.out.println(Thread.currentThread().getName() + "准备写入数据");
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.data = data;
                System.out.println(Thread.currentThread().getName() + "写入" + this.data);
            } finally {
                readWriteLock.writeLock().unlock();
            }
        }
        public void get() {
            readWriteLock.readLock().lock();
            try {
                System.out.println(Thread.currentThread().getName() + "准备读取数据");
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "读取" + this.data);
            } finally {
                readWriteLock.readLock().unlock();
            }
        }
    }
}
