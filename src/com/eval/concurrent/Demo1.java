package com.eval.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by evalcony on 2017/12/1.
 */
public class Demo1 {
    public Integer count = 0;
    public static void main(String[] args) {
        final Demo1 demo = new Demo1();
        Executor executor = Executors.newFixedThreadPool(10);
        for(int i=0;i<1000;i++){
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    demo.count++;
                }
            });
        }
        System.out.println("final count value:" + demo.count);
    }
}
