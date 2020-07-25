package com.ThreadTest.sleepInterrupt;

/**
 * @Author YongQiang
 * @Date 2020/5/22 13:34
 * @Version 1.0
 */
public class JoinTest {
    public static void main(String[] args) throws InterruptedException {
        JoinThread t1=new JoinThread("t1");
        JoinThread t2=new JoinThread("t2");

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("主线程开始执行！");
    }
}

class JoinThread extends Thread {
    public JoinThread(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + "执行了" + i + "次");
        }
    }
}
