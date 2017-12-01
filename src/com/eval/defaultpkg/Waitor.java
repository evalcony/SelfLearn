package com.eval.defaultpkg;

/**
 * Created by evalcony on 2017/11/30.
 */
public class Waitor implements SendCard {



    public void callUp(CallBack client) {
        client.callback();
    }

    public void sendBreakfirst(CBBreakfirst client) {
        client.breakfirst();
    }

    @Override
    public void sendCard() {
        System.out.println("这是本人名片");
    }
}
