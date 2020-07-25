package com.designModelTest.Singleton.example1;

/**
 * 懒汉模式
 * @Author YongQiang
 * @Date 2020/5/19 13:39
 * @Version 1.0
 */
public class Singleton2 {

    private Singleton2(){}

    private static volatile Singleton2 instance=null;

    public static Singleton2 getInstance(){
        if (instance==null){
            synchronized(Singleton2.class){
                if (instance==null){
                    instance=new Singleton2();
                    return instance;
                }
            }
        }
        return instance;
    }

}
