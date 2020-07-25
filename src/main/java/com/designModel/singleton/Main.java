package com.designModel.singleton;

/**
 * @Author YongQiang
 * @Date 2020/3/18 9:32
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {

        Singleton singleton1=Singleton.getSingleton();
        Singleton singleton2=Singleton.getSingleton();
        System.out.println(singleton1==singleton2);
    }
}
