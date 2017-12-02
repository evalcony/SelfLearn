package com.eval.designpattern.adapter;

/**
 * Created by evalcony on 2017/12/2.
 */
public class V5PowerKit implements V5Power{

    public V5PowerKit() {
        System.out.println("提供5V电压");
    }

    @Override
    public int provideV5Power() {
        System.out.println("提供5V电压");
        return 5;
    }
}
