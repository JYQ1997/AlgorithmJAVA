package com.ThreadTest.thredPool;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author YongQiang
 * @Date 2021/2/2 8:46
 * @Version 1.0
 */
public class ThreadPoolDemo {
    static
        ThreadPoolExecutor threadPoolExecutor=new ThreadPoolExecutor(2,4,60, TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(3),new ThreadPoolExecutor.AbortPolicy());
    public static void main(String[] args) throws InterruptedException {
        for (int i=0;i<10;i++){
            RunnableTest thread = new RunnableTest("线程"+i,"线程"+i);
            try{
                threadPoolExecutor.execute(thread);
            }catch (RejectedExecutionException rejectedExecutionException){
                System.out.println(thread.getThreadName() + "run reject:");
            }
            Thread.sleep(100);
        }
    }

}
