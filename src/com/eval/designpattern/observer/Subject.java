package com.eval.designpattern.observer;

/**
 * Created by evalcony on 2017/12/2.
 */
public interface Subject {
    void addObserver(Observer obs);
    void deleteObserver(Observer obs);
    void notifyObserver();
}
