package com.eval.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by evalcony on 2017/12/2.
 */
public class Boss implements Subject {

    private static List<Observer> list = null;

    @Override
    public void addObserver(Observer obs) {
        if (list == null) {
            list = new ArrayList<Observer>();
        }
        list.add(obs);
    }

    @Override
    public void deleteObserver(Observer obs) {
        if (list == null) return;

        for (int i = list.size()-1; i >= 0; --i) {
            if (list.get(i).equals(obs)) {
                list.remove(i);
                return;
            }
        }
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < list.size(); ++i) {
            list.get(i).update();
        }
    }
}
