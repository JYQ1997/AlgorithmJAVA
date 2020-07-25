package com.designModel.singleton;

/**
 * @Author YongQiang
 * @Date 2020/3/18 9:32
 * @Version 1.0
 */
public class Singleton {
    private static Singleton singleton=new Singleton();

    public Singleton() {
        System.out.println("生产了一个实例");
    }

    public static Singleton getSingleton() {
        return singleton;
    }
}
