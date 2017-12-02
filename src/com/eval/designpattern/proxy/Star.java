package com.eval.designpattern.proxy;

/**
 * Created by evalcony on 2017/12/2.
 */
public class Star implements IStar {

    private String name;

    public Star(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println("this is " + name + "'s show");
    }
}
