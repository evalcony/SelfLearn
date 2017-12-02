package com.eval.designpattern.adapter;

/**
 * Created by evalcony on 2017/12/2.
 */
public class V220PowerKit implements V220Power{

    public V220PowerKit() {
        System.out.println("提供220V电压");
    }

    @Override
    public int provideV220Power() {
        System.out.println("本设备提供220V电压");
        return 220;
    }
}
