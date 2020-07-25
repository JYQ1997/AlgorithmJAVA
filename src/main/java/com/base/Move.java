package com.base;

/**
 * @Author YongQiang
 * @Date 2020/4/29 8:46
 * @Version 1.0
 */
public class Move {

    public static void main(String[] args) {
        arithmeticMoveRight(-58,3);
        logicMoveRight(-58,3);
    }

    public static void arithmeticMoveRight(int num,int n){
        int result=num>>n;
        System.out.println("result = [" + result + "]");
    }

    public static void logicMoveRight(int num,int n){
        int result=num>>>n;
        System.out.println("result = [" + result + "]");
    }
}
