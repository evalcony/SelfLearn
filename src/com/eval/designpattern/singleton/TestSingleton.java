package com.eval.designpattern.singleton;

/**
 * Created by evalcony on 2017/12/2.
 */
public class TestSingleton {
    public static void main(String[] args) {

//        testSIC();
        testDoubleCheck();
    }

    public static void testLazy() {
        for (int i = 0; i < 10; ++i) {

            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    Singleton instance = LazySingleton.getInstance("哆啦A梦");
                    instance.hello();
                }
            });

            Thread t2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    Singleton instance = LazySingleton.getInstance("大雄");
                    instance.hello();
                }
            });

            Thread t3 = new Thread(new Runnable() {
                @Override
                public void run() {
                    Singleton instance = LazySingleton.getInstance("胖虎");
                    instance.hello();
                }
            });

            Thread t4 = new Thread(new Runnable() {
                @Override
                public void run() {
                    Singleton instance = LazySingleton.getInstance("小夫");
                    instance.hello();
                }
            });

            t1.start();
            t2.start();
            t3.start();
            t4.start();
            System.out.println("------");

        }
    }

    public static void testDoubleCheck() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton instance = DoubleCheckSingleton.getInstance("哆啦A梦");
                instance.hello();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton instance = DoubleCheckSingleton.getInstance("大雄");
                instance.hello();
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton instance = DoubleCheckSingleton.getInstance("胖虎");
                instance.hello();
            }
        });

        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton instance = DoubleCheckSingleton.getInstance("小夫");
                instance.hello();
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

    public static void testSIC() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton instance = SICSingleton.getInstance();
                instance.hello();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton instance = SICSingleton.getInstance();
                instance.hello();
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton instance = SICSingleton.getInstance();
                instance.hello();
            }
        });

        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton instance = SICSingleton.getInstance();
                instance.hello();
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
