package com.ThreadTest.unsafe;

import com.ThreadTest.unsafe.util.Count;

import java.util.ArrayList;
import java.util.List;




/**
 * 简单的多线程实现，线程不安全
 * @Author YongQiang
 * @Date 2020/5/19 15:52
 * @Version 1.0
 */
public class LambdaTest {

    public static void main(String[] args) {
        Count count=new Count();
        Runnable runnable=()->{
            for (int i = 0; i < 10000; i++) {
                count.increment();
            }
        };
        List<Thread> threads=new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(runnable);
            threads.add(thread);
            thread.start();
        }

        while (true){
            if (isAllThreadDead(threads)){
                System.out.println(count.getCount());
                break;
            }
        }
    }

    private static boolean isAllThreadDead(List<Thread> threads){
        for (Thread thread : threads) {
            if (thread.isAlive()) {
                return false;
            }
        }
        return true;
    }
}
