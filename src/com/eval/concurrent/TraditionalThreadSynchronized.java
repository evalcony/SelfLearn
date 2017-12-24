package com.eval.concurrent;

/**
 * Created by evalcony on 2017/12/25.
 */
public class TraditionalThreadSynchronized {
    public static void main(String[] args) {
        final Outputter output = new Outputter();

        for (int i = 0; i < 10; ++i) {
            Thread t1 = new Thread() {
                public void run() {
                    output.output("zhangsan");
                }
            };
            Thread t2 = new Thread() {
                public void run() {
                    output.output("lisi");
                }
            };
            t1.start();
            t2.start();

        }

//        Thread t1 = new Thread() {
//            public void run() {
//                output.output("zhangsan");
//            }
//        };
//        Thread t2 = new Thread() {
//            public void run() {
//                output.output("lisi");
//            }
//        };
//        t1.start();
//        t2.start();
    }

    static class Outputter {

        Object lock = new Object();

        public void output(String name) {
            synchronized (lock) {
                // TODO 为了保证对name的输出不是一个原子操作，这里逐个输出name的每个字符
                for (int i = 0; i < name.length(); i++) {
                    System.out.print(name.charAt(i));
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
                String a = "1234567890";
                for (int i = 0; i < a.length(); i++) {
                    System.out.print(a.charAt(i));
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println();
//            }
        }
    }
}
