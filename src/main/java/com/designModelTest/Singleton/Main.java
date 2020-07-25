package com.designModelTest.Singleton;

/**
 * @Author YongQiang
 * @Date 2020/3/18 9:42
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("开始");
        for (int i=0;i<10;i++){
            System.out.println("编号："+i+",票："+TicketMaker.getTicketMaker().getNextTicketNumber());
        }
        System.out.println("结束");

        for (int i=0;i<10;i++){
            System.out.println(Triple.getInstance(i%3));
        }
    }
}
