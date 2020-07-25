package com.designModelTest.Singleton.example1;

/**
 * 饿汉模式
 * @Author YongQiang
 * @Date 2020/5/19 13:28
 * @Version 1.0
 */
public class Singleton {
    private Singleton() {
    }

    private static final Singleton Instance = new Singleton();

    public static Singleton getInstance() {
        return Instance;
    }
}
