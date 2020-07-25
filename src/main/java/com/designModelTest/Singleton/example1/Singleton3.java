package com.designModelTest.Singleton.example1;

/**
 * @Author YongQiang
 * @Date 2020/5/19 13:49
 * @Version 1.0
 */
public class Singleton3 {
    private Singleton3(){}
    public static Singleton3 getInstance(){
        return SingletonHolder.Instance;
    }
    private static class SingletonHolder{
        private static final Singleton3 Instance=new Singleton3();
    }
}
