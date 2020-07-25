package com.ThreadTest.unsafe;

/**
 * 简单的多线程实现，线程不安全
 * @Author YongQiang
 * @Date 2020/5/19 15:48
 * @Version 1.0
 */
public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        RunnableImpl runnable=new RunnableImpl();
        new Thread(runnable).start();
    }
}
