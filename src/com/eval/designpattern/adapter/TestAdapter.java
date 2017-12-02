package com.eval.designpattern.adapter;

/**
 * Created by evalcony on 2017/12/2.
 */
public class TestAdapter {
    public static void main(String[] args) {
        V220V5Adapter adapter = new V220V5Adapter(new V5PowerKit());
        int  res = adapter.provideV220Power();
        System.out.println(res);

        adapter = new V220V5Adapter(new V220PowerKit());
        res = adapter.provideV5Power();
        System.out.println(res);
    }
}
