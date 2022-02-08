package com.cursor;

public class SingletonTest {
    private static SingletonTest singletonTest;
    public String test;


    private SingletonTest(String test) {
        this.test = test;
    }

    public static SingletonTest getSingletonTest(String test) {
        if (singletonTest == null) {
            singletonTest = new SingletonTest(test);
        }
        return singletonTest;
    }
}
