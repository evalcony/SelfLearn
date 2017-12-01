package com.eval.designpattern.observer;

/**
 * Created by evalcony on 2017/12/2.
 */
public class TestObserver {
    public static void main(String[] args) {
        Subject boss = new Boss();

        Observer ezio = new Sodier("Ezio");
        Observer conna = new Sodier("Conna");
        Observer altair = new Sodier("Altair");

        boss.addObserver(ezio);
        boss.addObserver(conna);
        boss.addObserver(altair);

        boss.notifyObserver();

        boss.deleteObserver(altair);

        boss.notifyObserver();

    }
}
