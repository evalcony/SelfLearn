package com.eval.defaultpkg;

/**
 * Created by evalcony on 2017/11/30.
 */
public class Me implements CallBack, CBBreakfirst {

    @Override
    public void callback() {
        System.out.println("wake up, Sir");
    }

    @Override
    public void breakfirst() {
        System.out.println("this is breakfirst A");
    }

    public void askForCard(SendCard waitor) {
        waitor.sendCard();
    }
}
