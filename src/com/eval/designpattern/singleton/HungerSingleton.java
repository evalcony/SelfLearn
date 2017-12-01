package com.eval.designpattern.singleton;

/**
 * Created by evalcony on 2017/12/2.
 */

/**
 * 饿汉式单例
 * 能够保证得到想要的对象，但无法从外部初始化
 */
public class HungerSingleton {
    private static HungerSingleton instance = new HungerSingleton("大雄");

    private String name;

    private HungerSingleton(String name) {
        this.name = name;
    }

    public static HungerSingleton getInstance() {
        return instance;
    }


}
