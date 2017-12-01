package com.eval.defaultpkg;

/**
 * Created by evalcony on 2017/10/14.
 */
public class Hello {
    public static void main(String[] args) {
        System.out.println("hello");
        Waitor waitor = new Waitor();

        Me me = new Me();
        B b = new B();

        waitor.callUp(me);
        waitor.sendBreakfirst(me);

        me.askForCard(waitor);

        waitor.callUp(b);
        waitor.sendBreakfirst(b);
    }
}
