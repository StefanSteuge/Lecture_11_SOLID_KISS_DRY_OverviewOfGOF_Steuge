package com.cursor;

public class Main {

    public static void main(String[] args) {
        SingletonTest singletonTest = SingletonTest.getSingletonTest("Just say, Hello!");
        SingletonTest singletonTest1 = SingletonTest.getSingletonTest("Hello world!");
        SingletonTest singletonTest2 = SingletonTest.getSingletonTest("Hello world again!");

        System.out.println(singletonTest.test + "\n" + singletonTest1.test + "\n" + singletonTest2.test);
    }
}