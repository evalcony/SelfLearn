package com.eval.concurrent;

/**
 * Created by evalcony on 2017/12/25.
 */
public class ThreadLocalTest {
    private static ThreadLocal<Integer> tl1 = new ThreadLocal<Integer>();
    private static ThreadLocal<Integer> tl2 = new ThreadLocal<Integer>();

    public static void main(String[] args) {
        tl1.set(1);
        tl2.set(2);
        System.out.println(tl1.get());
        System.out.println(tl2.get());

        tl1.set(3);
        tl2.set(4);

        System.out.println(tl1.get());
        System.out.println(tl2.get());
    }

}
