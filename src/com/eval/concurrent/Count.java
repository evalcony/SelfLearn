package com.eval.concurrent;

/**
 * Created by evalcony on 2017/12/25.
 */
public class Count {
    private int num = 0;

    public void count() {
        for (int i = 1; i <= 10; i++) {
            num += i;
        }
        System.out.println(Thread.currentThread().getName() + "-" + num);
    }
}
