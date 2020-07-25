package com.ThreadTest.unsafe.util;

/**
 * @Author YongQiang
 * @Date 2020/5/19 15:59
 * @Version 1.0
 */
public class Count {

    private int count=0;

    public void increment() {
        count++;
    }
    public int getCount(){
        return count;
    }
}
