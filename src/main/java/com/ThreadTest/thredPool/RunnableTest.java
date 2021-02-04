package com.ThreadTest.thredPool;

/**
 * @Author YongQiang
 * @Date 2021/2/2 8:55
 * @Version 1.0
 */

public class RunnableTest extends Thread {
    private String threadName;

    public RunnableTest(String name, String threadName) {
        super(name);
        this.threadName = threadName;
    }

    public String getThreadName() {
        return threadName;
    }

    @Override
    public void run() {
        System.out.println(this.threadName+"run start:");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.threadName+"run stop:");
    }
}
