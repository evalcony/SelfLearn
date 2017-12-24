package com.eval.concurrent;

/**
 * Created by evalcony on 2017/12/25.
 */
public class ThreadTest {
    public static void main(String[] args) {

        final Count count = new Count();

        Runnable runnable = new Runnable() {
            public void run() {
                count.count();
            }
        };
        for(int i = 0; i < 10; i++) {
            new Thread(runnable).start();
        }
    }
}
