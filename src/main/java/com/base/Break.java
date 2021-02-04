package com.base;

/**
 * @Author YongQiang
 * @Date 2021/2/4 14:07
 * @Version 1.0
 */
public class Break {
    public static void main(String[] args) {
        int x=0;
        retry:
        for (;;){
            x++;
            System.out.println("x = [" + x + "]");
            if (x>10)
                break retry;
        }
        System.out.println("结束");
    }
}
