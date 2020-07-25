package com.ThreadTest.unsafe;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Author YongQiang
 * @Date 2020/5/25 15:11
 * @Version 1.0
 */
public class ThreadCreationCmp {
    public static void main(String[] args) {
        Thread t;
        CountingTask ct=new CountingTask();
        final int numberOfProcess=Runtime.getRuntime().availableProcessors();
        for (int i = 0; i < 2 * numberOfProcess; i++) {
            t=new Thread(ct);
            t.start();
        }

        for (int i = 0; i < 2 * numberOfProcess; i++) {
            t=new CountingThread();
            t.start();
        }
    }

    static class Counter {
        private int count = 0;

        public void increment() {
            count++;
        }

        public int getValue() {
            return count;
        }
    }

    static class CountingTask implements Runnable {
        private Counter counter = new Counter();

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                counter.increment();
            }
            System.out.println("CountingTask:" + counter.getValue());
        }
    }

    static class CountingThread extends Thread {
        private Counter counter=new Counter();

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                counter.increment();
            }
            System.out.println("CountingThread:" + counter.getValue());
        }
    }
}
