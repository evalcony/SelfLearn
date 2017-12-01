package com.eval.defaultpkg;

/**
 * Created by evalcony on 2017/11/30.
 */
public class B implements CallBack, CBBreakfirst {
    @Override
    public void breakfirst() {
        System.out.println("I love breakfirst B");
    }

    @Override
    public void callback() {
        System.out.println("this is 7am, wake up sir");
    }
}
