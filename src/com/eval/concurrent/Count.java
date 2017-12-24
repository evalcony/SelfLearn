package com.eval.concurrent;

/**
 * Created by evalcony on 2017/12/25.
 */
public class Count {
    volatile int num = 0;
//    ThreadLocal<Integer> tl = new ThreadLocal<Integer>(){
//        protected Integer initialValue() {
//            return 0;
//        };
//    };
    public void count() {
//        int num = tl.get();

        for (int i = 1; i <= 10; i++) {
            num += i;
        }
        System.out.println(Thread.currentThread().getName() + "-" + num);
    }
}
