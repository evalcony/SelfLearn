package com.eval.designpattern.singleton;

/**
 * Created by evalcony on 2017/12/2.
 */

/**
 * 懒汉单例
 * 线程不安全
 */
public class LazySingleton extends Singleton {
    private static LazySingleton instance = null;

    private String name;

    private LazySingleton(){}
    private LazySingleton(String name) {
        this.name = name;
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public static LazySingleton getInstance(String name) {
        if (instance == null) {
            instance = new LazySingleton(name);
        }
        return instance;
    }

    public void hello() {
        if (name != null)
            System.out.println("hello " + name);
        else
            System.out.println("hello");
    }

}
