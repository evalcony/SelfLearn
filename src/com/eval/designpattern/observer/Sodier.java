package com.eval.designpattern.observer;

/**
 * Created by evalcony on 2017/12/2.
 */
public class Sodier implements Observer{

    private String name;

    public Sodier(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(name + "救驾");
    }
}
