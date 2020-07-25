package com.base;

import java.text.DecimalFormat;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Author YongQiang
 * @Date 2020/5/25 15:00
 * @Version 1.0
 */
public class main {

    private final ReadWriteLock readWriteLock=new ReentrantReadWriteLock();
    private Lock readLock=readWriteLock.readLock();
    private Lock writeLock=readWriteLock.writeLock();
    public static void main(String[] args) {
        //获取处理器个数
        /*int numberOfProcess=Runtime.getRuntime().availableProcessors();
        System.out.println(numberOfProcess);
        DecimalFormat df=new DecimalFormat("000");
        String x=df.format(2);
        System.out.println(x);*/

        //读写锁

    }

    public void reader() {
        readLock.lock();
        try {

        }finally {
            readLock.unlock();
        }
    }

    public void wirter(){
        writeLock.lock();
        try {

        }finally {
            writeLock.unlock();
        }
    }
}

