package com.ThreadTest.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author YongQiang
 * @Date 2020/5/22 16:59
 * @Version 1.0
 */
public class LockTest {

    public static void main(String[] args) {
        final Outputter1 output=new Outputter1();
        new Thread(){
            @Override
            public void run(){
                output.output("zhangsan");
            }
        }.start();
        new Thread(){
            @Override
            public void run(){
                output.output("lisi");
            }
        }.start();
    }
}

class Outputter1 {
    private Lock lock=new ReentrantLock();//锁对象
    public void output(String name){
        lock.lock();//得到锁
        try{
            for (int i = 0; i < name.length(); i++) {
                System.out.println(name.charAt(i));
            }
        }finally {
            lock.unlock();//释放锁
        }
    }
}
