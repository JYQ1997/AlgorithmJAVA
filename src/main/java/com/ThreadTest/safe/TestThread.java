package com.ThreadTest.safe;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * 简单的多线程，线程安全
 * @Author YongQiang
 * @Date 2020/5/21 14:21
 * @Version 1.0
 */
public class TestThread {

    private int count=0;

    public static void main(String[] args) {
        TestThread testThread=new TestThread();
        testThread.calaulation();
    }
    public void calaulation(){
        List<Thread> threads= Lists.newArrayList();

        Runnable runnable=()->{
            synchronized(this){
                for (int i = 0; i < 10000; i++) {
                    count++;
                }
            }
        };
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(runnable);
            threads.add(thread);
            thread.start();
        }
        while (true){
            if (allThreadFinish(threads)){
                System.out.println(count);
                break;
            }
        }
    }


    public static boolean allThreadFinish(List<Thread> threads){
        for (int i = 0; i < threads.size(); i++) {
            if (threads.get(i).isAlive()){
                return false;
            }
        }
        return true;
    }
}
