package com.eval.designpattern.builder;

/**
 * Created by evalcony on 2017/12/2.
 */
public class Person {
    private final String mName;
    private String mLoaction;
    private String mJob;
    private String mHabit;

    public Person(Builder builder) {
        this.mName = builder.name;
        this.mLoaction = builder.location;
        this.mJob = builder.job;
        this.mHabit = builder.habit;
    }

    public String getmName() {
        return mName;
    }

    public String getmLoaction() {
        return mLoaction;
    }

    public String getmJob() {
        return mJob;
    }

    public String getmHabit() {
        return mHabit;
    }

    public static class Builder {
        private final String name;
        private String location;
        private String job;
        private String habit;

        public Builder(String name) {
            this.name = name;
        }

        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }

        public Builder setJob(String job) {
            this.job = job;
            return this;
        }

        public Builder setHabit(String habit) {
            this.habit = habit;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
