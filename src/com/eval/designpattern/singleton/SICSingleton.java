package com.eval.designpattern.singleton;

/**
 * Created by evalcony on 2017/12/2.
 */

/**
 * 静态内部类实现的单例
 * 静态内部类可以保证线程安全，创建的都是同一个实例
 */
public class SICSingleton extends Singleton {
    private static class SingletonHolder {
        private static final SICSingleton instance = new SICSingleton();
    }
    private SICSingleton (){
    }

    public static SICSingleton getInstance() {
        return SingletonHolder.instance;
    }

    public void hello() {
        System.out.println(this);
    }

}
