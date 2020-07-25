package com.base;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * @Author YongQiang
 * @Date 2020/4/28 17:18
 * @Version 1.0
 */
public class HashMapTest {


    public static void main(String[] args) {

        int x = 1 << 31;
        int y=x-1;
        System.out.println("x="+x+",y="+y);
        int result=tableSizeFor(20);
        System.out.println(result);
     }

    static final int tableSizeFor(int cap) {
        //int x= (int) Math.pow(2,30);
        int MAXIMUM_CAPACITY = 1 << 30;
        int n=-1>>>Integer.numberOfLeadingZeros(cap-1);
       /* int n = cap;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;*/
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }
}
