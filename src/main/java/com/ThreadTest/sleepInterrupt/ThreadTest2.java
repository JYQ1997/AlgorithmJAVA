package com.ThreadTest.sleepInterrupt;

/**
 * 线程睡眠、唤醒、让步、合并
 * @Author YongQiang
 * @Date 2020/5/22 13:08
 * @Version 1.0
 */
public class ThreadTest2 {

    public static void main(String[] args) {
        Yield yield=new Yield();
        Thread thread01=new Thread(yield,"thread01");
        Thread thread02=new Thread(yield,"thread02");
        thread01.setPriority(Thread.MIN_PRIORITY);
        thread02.setPriority(Thread.MAX_PRIORITY);
        thread01.start();
        thread02.start();
    }
}

class Yield implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            System.out.println(String.format("%s：当前是第%s次循环",Thread.currentThread().getName(),i));
            if (i % 10 == 0) {
                System.out.println(String.format("%s：让步",Thread.currentThread().getName()));
                Thread.yield();
            }
        }
    }
}
