package com.ThreadTest.communication;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author YongQiang
 * @Date 2020/5/22 9:55
 * @Version 1.0
 */
public class Plate {

    private List<Object> foods = new ArrayList<>();

    public synchronized void enjony() {
        while (foods.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Object food = foods.get(0);
        foods.clear();
        notify();//唤醒阻塞队列线程
        System.out.println(String.format("顾客正在享受%s，好吃点赞。", food));
    }

    public synchronized void cooking() {
        while (foods.size() > 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Object food = "牛排";
        foods.add(food);
        notify();
        System.out.println(String.format("厨师制作%s，并放到顾客的盘子里", food));
    }

    public static void main(String[] args) {
        Plate plate=new Plate();
        for (int i = 0; i < 10; i++) {
            new Thread(()->plate.cooking()).start();
            new Thread(()->plate.enjony()).start();
        }
    }
}
