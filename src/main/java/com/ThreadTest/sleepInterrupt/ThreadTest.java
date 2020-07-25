package com.ThreadTest.sleepInterrupt;

/**
 * 线程睡眠
 * @Author YongQiang
 * @Date 2020/5/22 11:21
 * @Version 1.0
 */
public class ThreadTest {

    public synchronized void business(){
        for (int i = 0; i < 100; i++) {
            if (("thread01".equals(Thread.currentThread().getName())) && (i % 10 == 0)) {
                try {
                    System.out.println(String.format("%s要困了，要睡觉了。", Thread.currentThread().getName()));
                    Thread.sleep(2000);
                    System.out.println(String.format("%s睡醒了，继续运行。", Thread.currentThread().getName()));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(String.format("%s：当前是第%s次循环。", Thread.currentThread().getName(),i));
        }
    }

    public static void main(String[] args) {
        ThreadTest threadTest=new ThreadTest();
        new Thread(()->threadTest.business(),"thread01").start();
        new Thread(()->threadTest.business(),"thread02").start();
    }
}
