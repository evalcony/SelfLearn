package com.eval.designpattern.builder;

/**
 * Created by evalcony on 2017/12/2.
 */
public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person.Builder("eval")
                            .setLocation("New York")
                            .setHabit("LOL")
                            .build();

        System.out.println(person.getmName());
        System.out.println(person.getmLoaction());
        System.out.println(person.getmJob());
        System.out.println(person.getmHabit());
    }
}
