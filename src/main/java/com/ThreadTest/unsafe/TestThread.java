package com.ThreadTest.unsafe;

/**
 * 简单多线程的实现，线程不安全
 * @Author YongQiang
 * @Date 2020/5/19 15:40
 * @Version 1.0
 */
public class TestThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args){
        TestThread testThread = new TestThread();
        State state=testThread.getState();
        System.out.println("state = [" + state + "]");
        //testThread.start();
    }
}
