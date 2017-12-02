package com.eval.designpattern.proxy;

/**
 * Created by evalcony on 2017/12/2.
 */
public class MovieStar implements IMovieStar {
    @Override
    public void play() {
        System.out.println("play a movie");
    }
}
