package com.eval.designpattern.proxy;

/**
 * Created by evalcony on 2017/12/2.
 */
public class TestProxy {
    public static void main(String[] args) {
        IStar s = new Star("aaa");

        ProxyHandler handler = new ProxyHandler(s);
        IStar proxy = (IStar) handler.getProxy();
        proxy.show();

        IStar s2 = new Star("bbb");
        handler = new ProxyHandler(s2);
        IStar s2Proxy = (IStar) handler.getProxy();
        s2Proxy.show();

        IMovieStar movieStar = new MovieStar();
        handler = new ProxyHandler(movieStar);
        IMovieStar mvstarProxy = (IMovieStar) handler.getProxy();
        mvstarProxy.play();

    }
}
