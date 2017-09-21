package com.cn.web;

/**
 * Created by A on 2017/7/31.
 */
public class Person {
    private static Person ourInstance = new Person();

    public static Person getInstance() {
        return ourInstance;
    }

    private Person() {
    }
}
