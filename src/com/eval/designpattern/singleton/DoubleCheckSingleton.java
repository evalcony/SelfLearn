package com.eval.designpattern.singleton;

/**
 * Created by evalcony on 2017/12/2.
 */


/**
 *
 * 懒汉单例，线程安全
 *
 * 为了避免在多线程下创建多个实例的情况出现，我们需要进行锁控制。
 * 但加锁会导致效率降低，所以做了优化，当instance为null时，才加锁进行创建。其他时候直接返回即可。
 *
 * (1)
 * 由于为null的instance对象不能加锁，所以要用一个方法创建instance对象，对方法加锁。
 * 这种加锁方法是线程不安全的，即实例不唯一
 *
 * (2)
 * 在getInstance()方法上加锁，可以保证实例唯一，线程安全.
 * 但是由于线程的运行顺序是不可知的，所以不能预测到实际生成的是哪个实例。
 *
 * (3)
 * 而采用加2把锁的方式，能保证实例唯一，但同样不能预测到生成的是哪个实例。
 *
 * (4)
 * 这才是真正的双重检验。不是对instance加锁，而是对类加锁。
 * 保证线程安全，保证效率（没有对方法加锁，只在创建对象时加锁），但不保证得到想要的实例。
 */
public class DoubleCheckSingleton extends Singleton{
    private static DoubleCheckSingleton instance = null;

    private String name;

    private DoubleCheckSingleton(String name) {
        this.name = name;
    }

    // (1)

//    public static DoubleCheckSingleton getInstance(String name) {
//        if (instance == null) {
//            createInstance(name);
//        }
//        return instance;
//    }

    // (2)

//    public synchronized static DoubleCheckSingleton getInstance(String name) {
//        if (instance == null) {
//            instance = new DoubleCheckSingleton(name);
//        }
//        return instance;
//    }


    // (3)
//    public synchronized static DoubleCheckSingleton getInstance(String name) {
//        if (instance == null) {
//            createInstance(name);
//        }
//        return instance;
//    }

    // (4)

    public static DoubleCheckSingleton getInstance(String name) {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton(name);
                }
            }
        }
        return instance;
    }

    private synchronized static void createInstance(String name) {
        instance = new DoubleCheckSingleton(name);
    }

    public void hello() {
        System.out.println("hello " + name);
    }
}
