package com.ThreadTest.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author YongQiang
 * @Date 2020/5/22 13:52
 * @Version 1.0
 */
public class ThreadPoolTest {

    public static void main(String[] args) {

        ExecutorService threadpool = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            final int taskID=i;
            threadpool.execute(new Runnable() {

                @Override
                public void run() {
                    for (int i = 0; i < 5; i++) {
                        try {
                            Thread.sleep(20);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("第"+taskID+"次任务的第"+i+"次执行");
                    }
                }
            });
        }
        threadpool.shutdown();
    }
}


