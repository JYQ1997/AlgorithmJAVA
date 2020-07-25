package com.designModelTest.Singleton.example1;

/**
 * 静态内部类单例模式
 * @Author YongQiang
 * @Date 2020/5/19 13:27
 * @Version 1.0
 */
public class index {

    public static void main(String[] args) {
        Singleton3 singleton = Singleton3.getInstance();
        Singleton3 singleton2 = Singleton3.getInstance();
        System.out.println("singleton=" + singleton);
        System.out.println("singleton2="+singleton2);
    }
}
