package com.eval.designpattern.adapter;

/**
 * Created by evalcony on 2017/12/2.
 */

/**
 * 5v和220v适配器，能够将220v和5v适配，相互转换
 */
public class V220V5Adapter implements V5Power, V220Power{

    private V220Power v220PowerKit;

    private V5Power v5PowerKit;

    public V220V5Adapter(V220Power v220PowerKit) {
        this.v220PowerKit = v220PowerKit;
    }

    public V220V5Adapter(V5Power v5PowerKit) {
        this.v5PowerKit = v5PowerKit;
    }

    @Override
    public int provideV5Power() {
        System.out.println("转换成5V电压");
        return 5;
    }

    @Override
    public int provideV220Power() {
        System.out.println("转换成220V电压");
        return 220;
    }
}
