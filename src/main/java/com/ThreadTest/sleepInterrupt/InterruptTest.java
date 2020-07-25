package com.ThreadTest.sleepInterrupt;

/**
 * @Author YongQiang
 * @Date 2020/5/22 13:21
 * @Version 1.0
 */
public class InterruptTest {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread("MyThread");
        t.start();
        Thread.sleep(100);
        t.interrupt();
    }
}

class MyThread extends Thread{
    int i=0;

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (!isInterrupted()) {//死循环，等待被中断
            System.out.println(getName()+getId()+"执行了"+ ++i +"次");
        }
    }
}
