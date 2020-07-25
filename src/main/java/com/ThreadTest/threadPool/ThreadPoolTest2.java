package com.ThreadTest.threadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Author YongQiang
 * @Date 2020/5/22 16:01
 * @Version 1.0
 */
public class ThreadPoolTest2 {
    public static void main(String[] args) {
        ScheduledExecutorService schedulePool= Executors.newScheduledThreadPool(1);
        schedulePool.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("爆炸");
            }
        },5, TimeUnit.SECONDS);

        schedulePool.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("爆炸");
            }
        }, 5, 2, TimeUnit.SECONDS);
    }
}
